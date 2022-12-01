// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import java.util.Collections;
import com.google.protobuf.Parser;
import java.util.List;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class DungeonSettleExhibitionInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_DungeonSettleExhibitionInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_DungeonSettleExhibitionInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private DungeonSettleExhibitionInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return DungeonSettleExhibitionInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n!DungeonSettleExhibitionInfo.proto\u001a\u001bExhibitionDisplayInfo.proto\u001a\u0016OnlinePlayerInfo.proto\"p\n\u001bDungeonSettleExhibitionInfo\u0012&\n\u000bplayer_info\u0018\u0003 \u0001(\u000b2\u0011.OnlinePlayerInfo\u0012)\n\tcard_list\u0018\r \u0003(\u000b2\u0016.ExhibitionDisplayInfoB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        DungeonSettleExhibitionInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { ExhibitionDisplayInfoOuterClass.getDescriptor(), OnlinePlayerInfoOuterClass.getDescriptor() });
        internal_static_DungeonSettleExhibitionInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_DungeonSettleExhibitionInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(DungeonSettleExhibitionInfoOuterClass.internal_static_DungeonSettleExhibitionInfo_descriptor, new String[] { "PlayerInfo", "CardList" });
        ExhibitionDisplayInfoOuterClass.getDescriptor();
        OnlinePlayerInfoOuterClass.getDescriptor();
    }
    
    public static final class DungeonSettleExhibitionInfo extends GeneratedMessageV3 implements DungeonSettleExhibitionInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int PLAYER_INFO_FIELD_NUMBER = 3;
        private OnlinePlayerInfoOuterClass.OnlinePlayerInfo playerInfo_;
        public static final int CARD_LIST_FIELD_NUMBER = 13;
        private List<ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo> cardList_;
        private byte memoizedIsInitialized;
        private static final DungeonSettleExhibitionInfo DEFAULT_INSTANCE;
        private static final Parser<DungeonSettleExhibitionInfo> PARSER;
        
        private DungeonSettleExhibitionInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private DungeonSettleExhibitionInfo() {
            this.memoizedIsInitialized = -1;
            this.cardList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new DungeonSettleExhibitionInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private DungeonSettleExhibitionInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            int mutable_bitField0_ = 0;
            final UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    final int tag = input.readTag();
                    switch (tag) {
                        case 0: {
                            done = true;
                            continue;
                        }
                        case 26: {
                            OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder subBuilder = null;
                            if (this.playerInfo_ != null) {
                                subBuilder = this.playerInfo_.toBuilder();
                            }
                            this.playerInfo_ = input.readMessage(OnlinePlayerInfoOuterClass.OnlinePlayerInfo.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.playerInfo_);
                                this.playerInfo_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 106: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.cardList_ = new ArrayList<ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.cardList_.add(input.readMessage(ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo.parser(), extensionRegistry));
                            continue;
                        }
                        default: {
                            if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                                continue;
                            }
                            continue;
                        }
                    }
                }
            }
            catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            }
            catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
            }
            finally {
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.cardList_ = Collections.unmodifiableList((List<? extends ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo>)this.cardList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return DungeonSettleExhibitionInfoOuterClass.internal_static_DungeonSettleExhibitionInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return DungeonSettleExhibitionInfoOuterClass.internal_static_DungeonSettleExhibitionInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(DungeonSettleExhibitionInfo.class, Builder.class);
        }
        
        @Override
        public boolean hasPlayerInfo() {
            return this.playerInfo_ != null;
        }
        
        @Override
        public OnlinePlayerInfoOuterClass.OnlinePlayerInfo getPlayerInfo() {
            return (this.playerInfo_ == null) ? OnlinePlayerInfoOuterClass.OnlinePlayerInfo.getDefaultInstance() : this.playerInfo_;
        }
        
        @Override
        public OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder getPlayerInfoOrBuilder() {
            return this.getPlayerInfo();
        }
        
        @Override
        public List<ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo> getCardListList() {
            return this.cardList_;
        }
        
        @Override
        public List<? extends ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfoOrBuilder> getCardListOrBuilderList() {
            return this.cardList_;
        }
        
        @Override
        public int getCardListCount() {
            return this.cardList_.size();
        }
        
        @Override
        public ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo getCardList(final int index) {
            return this.cardList_.get(index);
        }
        
        @Override
        public ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfoOrBuilder getCardListOrBuilder(final int index) {
            return this.cardList_.get(index);
        }
        
        @Override
        public final boolean isInitialized() {
            final byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }
        
        @Override
        public void writeTo(final CodedOutputStream output) throws IOException {
            if (this.playerInfo_ != null) {
                output.writeMessage(3, this.getPlayerInfo());
            }
            for (int i = 0; i < this.cardList_.size(); ++i) {
                output.writeMessage(13, this.cardList_.get(i));
            }
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if (this.playerInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(3, this.getPlayerInfo());
            }
            for (int i = 0; i < this.cardList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(13, this.cardList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DungeonSettleExhibitionInfo)) {
                return super.equals(obj);
            }
            final DungeonSettleExhibitionInfo other = (DungeonSettleExhibitionInfo)obj;
            return this.hasPlayerInfo() == other.hasPlayerInfo() && (!this.hasPlayerInfo() || this.getPlayerInfo().equals(other.getPlayerInfo())) && this.getCardListList().equals(other.getCardListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasPlayerInfo()) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getPlayerInfo().hashCode();
            }
            if (this.getCardListCount() > 0) {
                hash = 37 * hash + 13;
                hash = 53 * hash + this.getCardListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static DungeonSettleExhibitionInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return DungeonSettleExhibitionInfo.PARSER.parseFrom(data);
        }
        
        public static DungeonSettleExhibitionInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return DungeonSettleExhibitionInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static DungeonSettleExhibitionInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return DungeonSettleExhibitionInfo.PARSER.parseFrom(data);
        }
        
        public static DungeonSettleExhibitionInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return DungeonSettleExhibitionInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static DungeonSettleExhibitionInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return DungeonSettleExhibitionInfo.PARSER.parseFrom(data);
        }
        
        public static DungeonSettleExhibitionInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return DungeonSettleExhibitionInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static DungeonSettleExhibitionInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DungeonSettleExhibitionInfo.PARSER, input);
        }
        
        public static DungeonSettleExhibitionInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DungeonSettleExhibitionInfo.PARSER, input, extensionRegistry);
        }
        
        public static DungeonSettleExhibitionInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(DungeonSettleExhibitionInfo.PARSER, input);
        }
        
        public static DungeonSettleExhibitionInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(DungeonSettleExhibitionInfo.PARSER, input, extensionRegistry);
        }
        
        public static DungeonSettleExhibitionInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DungeonSettleExhibitionInfo.PARSER, input);
        }
        
        public static DungeonSettleExhibitionInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DungeonSettleExhibitionInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return DungeonSettleExhibitionInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final DungeonSettleExhibitionInfo prototype) {
            return DungeonSettleExhibitionInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == DungeonSettleExhibitionInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static DungeonSettleExhibitionInfo getDefaultInstance() {
            return DungeonSettleExhibitionInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<DungeonSettleExhibitionInfo> parser() {
            return DungeonSettleExhibitionInfo.PARSER;
        }
        
        @Override
        public Parser<DungeonSettleExhibitionInfo> getParserForType() {
            return DungeonSettleExhibitionInfo.PARSER;
        }
        
        @Override
        public DungeonSettleExhibitionInfo getDefaultInstanceForType() {
            return DungeonSettleExhibitionInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new DungeonSettleExhibitionInfo();
            PARSER = new AbstractParser<DungeonSettleExhibitionInfo>() {
                @Override
                public DungeonSettleExhibitionInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new DungeonSettleExhibitionInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DungeonSettleExhibitionInfoOrBuilder
        {
            private int bitField0_;
            private OnlinePlayerInfoOuterClass.OnlinePlayerInfo playerInfo_;
            private SingleFieldBuilderV3<OnlinePlayerInfoOuterClass.OnlinePlayerInfo, OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder, OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder> playerInfoBuilder_;
            private List<ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo> cardList_;
            private RepeatedFieldBuilderV3<ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo, ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo.Builder, ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfoOrBuilder> cardListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return DungeonSettleExhibitionInfoOuterClass.internal_static_DungeonSettleExhibitionInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return DungeonSettleExhibitionInfoOuterClass.internal_static_DungeonSettleExhibitionInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(DungeonSettleExhibitionInfo.class, Builder.class);
            }
            
            private Builder() {
                this.cardList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.cardList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (DungeonSettleExhibitionInfo.alwaysUseFieldBuilders) {
                    this.getCardListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.playerInfoBuilder_ == null) {
                    this.playerInfo_ = null;
                }
                else {
                    this.playerInfo_ = null;
                    this.playerInfoBuilder_ = null;
                }
                if (this.cardListBuilder_ == null) {
                    this.cardList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.cardListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return DungeonSettleExhibitionInfoOuterClass.internal_static_DungeonSettleExhibitionInfo_descriptor;
            }
            
            @Override
            public DungeonSettleExhibitionInfo getDefaultInstanceForType() {
                return DungeonSettleExhibitionInfo.getDefaultInstance();
            }
            
            @Override
            public DungeonSettleExhibitionInfo build() {
                final DungeonSettleExhibitionInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public DungeonSettleExhibitionInfo buildPartial() {
                final DungeonSettleExhibitionInfo result = new DungeonSettleExhibitionInfo(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.playerInfoBuilder_ == null) {
                    result.playerInfo_ = this.playerInfo_;
                }
                else {
                    result.playerInfo_ = this.playerInfoBuilder_.build();
                }
                if (this.cardListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.cardList_ = Collections.unmodifiableList((List<? extends ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo>)this.cardList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.cardList_ = this.cardList_;
                }
                else {
                    result.cardList_ = this.cardListBuilder_.build();
                }
                this.onBuilt();
                return result;
            }
            
            @Override
            public Builder clone() {
                return super.clone();
            }
            
            @Override
            public Builder setField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.setField(field, value);
            }
            
            @Override
            public Builder clearField(final Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            
            @Override
            public Builder clearOneof(final Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            
            @Override
            public Builder setRepeatedField(final Descriptors.FieldDescriptor field, final int index, final Object value) {
                return super.setRepeatedField(field, index, value);
            }
            
            @Override
            public Builder addRepeatedField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.addRepeatedField(field, value);
            }
            
            @Override
            public Builder mergeFrom(final Message other) {
                if (other instanceof DungeonSettleExhibitionInfo) {
                    return this.mergeFrom((DungeonSettleExhibitionInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final DungeonSettleExhibitionInfo other) {
                if (other == DungeonSettleExhibitionInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.hasPlayerInfo()) {
                    this.mergePlayerInfo(other.getPlayerInfo());
                }
                if (this.cardListBuilder_ == null) {
                    if (!other.cardList_.isEmpty()) {
                        if (this.cardList_.isEmpty()) {
                            this.cardList_ = other.cardList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureCardListIsMutable();
                            this.cardList_.addAll(other.cardList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.cardList_.isEmpty()) {
                    if (this.cardListBuilder_.isEmpty()) {
                        this.cardListBuilder_.dispose();
                        this.cardListBuilder_ = null;
                        this.cardList_ = other.cardList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.cardListBuilder_ = (DungeonSettleExhibitionInfo.alwaysUseFieldBuilders ? this.getCardListFieldBuilder() : null);
                    }
                    else {
                        this.cardListBuilder_.addAllMessages(other.cardList_);
                    }
                }
                this.mergeUnknownFields(other.unknownFields);
                this.onChanged();
                return this;
            }
            
            @Override
            public final boolean isInitialized() {
                return true;
            }
            
            @Override
            public Builder mergeFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                DungeonSettleExhibitionInfo parsedMessage = null;
                try {
                    parsedMessage = DungeonSettleExhibitionInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (DungeonSettleExhibitionInfo)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            @Override
            public boolean hasPlayerInfo() {
                return this.playerInfoBuilder_ != null || this.playerInfo_ != null;
            }
            
            @Override
            public OnlinePlayerInfoOuterClass.OnlinePlayerInfo getPlayerInfo() {
                if (this.playerInfoBuilder_ == null) {
                    return (this.playerInfo_ == null) ? OnlinePlayerInfoOuterClass.OnlinePlayerInfo.getDefaultInstance() : this.playerInfo_;
                }
                return this.playerInfoBuilder_.getMessage();
            }
            
            public Builder setPlayerInfo(final OnlinePlayerInfoOuterClass.OnlinePlayerInfo value) {
                if (this.playerInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.playerInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.playerInfoBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setPlayerInfo(final OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder builderForValue) {
                if (this.playerInfoBuilder_ == null) {
                    this.playerInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.playerInfoBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergePlayerInfo(final OnlinePlayerInfoOuterClass.OnlinePlayerInfo value) {
                if (this.playerInfoBuilder_ == null) {
                    if (this.playerInfo_ != null) {
                        this.playerInfo_ = OnlinePlayerInfoOuterClass.OnlinePlayerInfo.newBuilder(this.playerInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.playerInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.playerInfoBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearPlayerInfo() {
                if (this.playerInfoBuilder_ == null) {
                    this.playerInfo_ = null;
                    this.onChanged();
                }
                else {
                    this.playerInfo_ = null;
                    this.playerInfoBuilder_ = null;
                }
                return this;
            }
            
            public OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder getPlayerInfoBuilder() {
                this.onChanged();
                return this.getPlayerInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder getPlayerInfoOrBuilder() {
                if (this.playerInfoBuilder_ != null) {
                    return this.playerInfoBuilder_.getMessageOrBuilder();
                }
                return (this.playerInfo_ == null) ? OnlinePlayerInfoOuterClass.OnlinePlayerInfo.getDefaultInstance() : this.playerInfo_;
            }
            
            private SingleFieldBuilderV3<OnlinePlayerInfoOuterClass.OnlinePlayerInfo, OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder, OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder> getPlayerInfoFieldBuilder() {
                if (this.playerInfoBuilder_ == null) {
                    this.playerInfoBuilder_ = new SingleFieldBuilderV3<OnlinePlayerInfoOuterClass.OnlinePlayerInfo, OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder, OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder>(this.getPlayerInfo(), this.getParentForChildren(), this.isClean());
                    this.playerInfo_ = null;
                }
                return this.playerInfoBuilder_;
            }
            
            private void ensureCardListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.cardList_ = new ArrayList<ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo>(this.cardList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo> getCardListList() {
                if (this.cardListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo>)this.cardList_);
                }
                return this.cardListBuilder_.getMessageList();
            }
            
            @Override
            public int getCardListCount() {
                if (this.cardListBuilder_ == null) {
                    return this.cardList_.size();
                }
                return this.cardListBuilder_.getCount();
            }
            
            @Override
            public ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo getCardList(final int index) {
                if (this.cardListBuilder_ == null) {
                    return this.cardList_.get(index);
                }
                return this.cardListBuilder_.getMessage(index);
            }
            
            public Builder setCardList(final int index, final ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo value) {
                if (this.cardListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureCardListIsMutable();
                    this.cardList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.cardListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setCardList(final int index, final ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo.Builder builderForValue) {
                if (this.cardListBuilder_ == null) {
                    this.ensureCardListIsMutable();
                    this.cardList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.cardListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addCardList(final ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo value) {
                if (this.cardListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureCardListIsMutable();
                    this.cardList_.add(value);
                    this.onChanged();
                }
                else {
                    this.cardListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addCardList(final int index, final ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo value) {
                if (this.cardListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureCardListIsMutable();
                    this.cardList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.cardListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addCardList(final ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo.Builder builderForValue) {
                if (this.cardListBuilder_ == null) {
                    this.ensureCardListIsMutable();
                    this.cardList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.cardListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addCardList(final int index, final ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo.Builder builderForValue) {
                if (this.cardListBuilder_ == null) {
                    this.ensureCardListIsMutable();
                    this.cardList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.cardListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllCardList(final Iterable<? extends ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo> values) {
                if (this.cardListBuilder_ == null) {
                    this.ensureCardListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.cardList_);
                    this.onChanged();
                }
                else {
                    this.cardListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearCardList() {
                if (this.cardListBuilder_ == null) {
                    this.cardList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.cardListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeCardList(final int index) {
                if (this.cardListBuilder_ == null) {
                    this.ensureCardListIsMutable();
                    this.cardList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.cardListBuilder_.remove(index);
                }
                return this;
            }
            
            public ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo.Builder getCardListBuilder(final int index) {
                return this.getCardListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfoOrBuilder getCardListOrBuilder(final int index) {
                if (this.cardListBuilder_ == null) {
                    return this.cardList_.get(index);
                }
                return this.cardListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfoOrBuilder> getCardListOrBuilderList() {
                if (this.cardListBuilder_ != null) {
                    return this.cardListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfoOrBuilder>)this.cardList_);
            }
            
            public ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo.Builder addCardListBuilder() {
                return this.getCardListFieldBuilder().addBuilder(ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo.getDefaultInstance());
            }
            
            public ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo.Builder addCardListBuilder(final int index) {
                return this.getCardListFieldBuilder().addBuilder(index, ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo.getDefaultInstance());
            }
            
            public List<ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo.Builder> getCardListBuilderList() {
                return this.getCardListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo, ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo.Builder, ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfoOrBuilder> getCardListFieldBuilder() {
                if (this.cardListBuilder_ == null) {
                    this.cardListBuilder_ = new RepeatedFieldBuilderV3<ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo, ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo.Builder, ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfoOrBuilder>(this.cardList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.cardList_ = null;
                }
                return this.cardListBuilder_;
            }
            
            @Override
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface DungeonSettleExhibitionInfoOrBuilder extends MessageOrBuilder
    {
        boolean hasPlayerInfo();
        
        OnlinePlayerInfoOuterClass.OnlinePlayerInfo getPlayerInfo();
        
        OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder getPlayerInfoOrBuilder();
        
        List<ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo> getCardListList();
        
        ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo getCardList(final int p0);
        
        int getCardListCount();
        
        List<? extends ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfoOrBuilder> getCardListOrBuilderList();
        
        ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfoOrBuilder getCardListOrBuilder(final int p0);
    }
}
