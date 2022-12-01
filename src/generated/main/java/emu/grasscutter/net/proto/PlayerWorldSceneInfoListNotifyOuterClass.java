// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
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

public final class PlayerWorldSceneInfoListNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_PlayerWorldSceneInfoListNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_PlayerWorldSceneInfoListNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private PlayerWorldSceneInfoListNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return PlayerWorldSceneInfoListNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n$PlayerWorldSceneInfoListNotify.proto\u001a\u001aPlayerWorldSceneInfo.proto\"J\n\u001ePlayerWorldSceneInfoListNotify\u0012(\n\tinfo_list\u0018\u0005 \u0003(\u000b2\u0015.PlayerWorldSceneInfoB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        PlayerWorldSceneInfoListNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { PlayerWorldSceneInfoOuterClass.getDescriptor() });
        internal_static_PlayerWorldSceneInfoListNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_PlayerWorldSceneInfoListNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(PlayerWorldSceneInfoListNotifyOuterClass.internal_static_PlayerWorldSceneInfoListNotify_descriptor, new String[] { "InfoList" });
        PlayerWorldSceneInfoOuterClass.getDescriptor();
    }
    
    public static final class PlayerWorldSceneInfoListNotify extends GeneratedMessageV3 implements PlayerWorldSceneInfoListNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int INFO_LIST_FIELD_NUMBER = 5;
        private List<PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo> infoList_;
        private byte memoizedIsInitialized;
        private static final PlayerWorldSceneInfoListNotify DEFAULT_INSTANCE;
        private static final Parser<PlayerWorldSceneInfoListNotify> PARSER;
        
        private PlayerWorldSceneInfoListNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private PlayerWorldSceneInfoListNotify() {
            this.memoizedIsInitialized = -1;
            this.infoList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new PlayerWorldSceneInfoListNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private PlayerWorldSceneInfoListNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 42: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.infoList_ = new ArrayList<PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.infoList_.add(input.readMessage(PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo.parser(), extensionRegistry));
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
                    this.infoList_ = Collections.unmodifiableList((List<? extends PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo>)this.infoList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return PlayerWorldSceneInfoListNotifyOuterClass.internal_static_PlayerWorldSceneInfoListNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return PlayerWorldSceneInfoListNotifyOuterClass.internal_static_PlayerWorldSceneInfoListNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerWorldSceneInfoListNotify.class, Builder.class);
        }
        
        @Override
        public List<PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo> getInfoListList() {
            return this.infoList_;
        }
        
        @Override
        public List<? extends PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfoOrBuilder> getInfoListOrBuilderList() {
            return this.infoList_;
        }
        
        @Override
        public int getInfoListCount() {
            return this.infoList_.size();
        }
        
        @Override
        public PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo getInfoList(final int index) {
            return this.infoList_.get(index);
        }
        
        @Override
        public PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfoOrBuilder getInfoListOrBuilder(final int index) {
            return this.infoList_.get(index);
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
            for (int i = 0; i < this.infoList_.size(); ++i) {
                output.writeMessage(5, this.infoList_.get(i));
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
            for (int i = 0; i < this.infoList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(5, this.infoList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PlayerWorldSceneInfoListNotify)) {
                return super.equals(obj);
            }
            final PlayerWorldSceneInfoListNotify other = (PlayerWorldSceneInfoListNotify)obj;
            return this.getInfoListList().equals(other.getInfoListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getInfoListCount() > 0) {
                hash = 37 * hash + 5;
                hash = 53 * hash + this.getInfoListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static PlayerWorldSceneInfoListNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return PlayerWorldSceneInfoListNotify.PARSER.parseFrom(data);
        }
        
        public static PlayerWorldSceneInfoListNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerWorldSceneInfoListNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerWorldSceneInfoListNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return PlayerWorldSceneInfoListNotify.PARSER.parseFrom(data);
        }
        
        public static PlayerWorldSceneInfoListNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerWorldSceneInfoListNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerWorldSceneInfoListNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return PlayerWorldSceneInfoListNotify.PARSER.parseFrom(data);
        }
        
        public static PlayerWorldSceneInfoListNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerWorldSceneInfoListNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerWorldSceneInfoListNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerWorldSceneInfoListNotify.PARSER, input);
        }
        
        public static PlayerWorldSceneInfoListNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerWorldSceneInfoListNotify.PARSER, input, extensionRegistry);
        }
        
        public static PlayerWorldSceneInfoListNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerWorldSceneInfoListNotify.PARSER, input);
        }
        
        public static PlayerWorldSceneInfoListNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerWorldSceneInfoListNotify.PARSER, input, extensionRegistry);
        }
        
        public static PlayerWorldSceneInfoListNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerWorldSceneInfoListNotify.PARSER, input);
        }
        
        public static PlayerWorldSceneInfoListNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerWorldSceneInfoListNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return PlayerWorldSceneInfoListNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final PlayerWorldSceneInfoListNotify prototype) {
            return PlayerWorldSceneInfoListNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == PlayerWorldSceneInfoListNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static PlayerWorldSceneInfoListNotify getDefaultInstance() {
            return PlayerWorldSceneInfoListNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<PlayerWorldSceneInfoListNotify> parser() {
            return PlayerWorldSceneInfoListNotify.PARSER;
        }
        
        @Override
        public Parser<PlayerWorldSceneInfoListNotify> getParserForType() {
            return PlayerWorldSceneInfoListNotify.PARSER;
        }
        
        @Override
        public PlayerWorldSceneInfoListNotify getDefaultInstanceForType() {
            return PlayerWorldSceneInfoListNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new PlayerWorldSceneInfoListNotify();
            PARSER = new AbstractParser<PlayerWorldSceneInfoListNotify>() {
                @Override
                public PlayerWorldSceneInfoListNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new PlayerWorldSceneInfoListNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PlayerWorldSceneInfoListNotifyOrBuilder
        {
            private int bitField0_;
            private List<PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo> infoList_;
            private RepeatedFieldBuilderV3<PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo, PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo.Builder, PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfoOrBuilder> infoListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return PlayerWorldSceneInfoListNotifyOuterClass.internal_static_PlayerWorldSceneInfoListNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return PlayerWorldSceneInfoListNotifyOuterClass.internal_static_PlayerWorldSceneInfoListNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerWorldSceneInfoListNotify.class, Builder.class);
            }
            
            private Builder() {
                this.infoList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.infoList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (PlayerWorldSceneInfoListNotify.alwaysUseFieldBuilders) {
                    this.getInfoListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.infoListBuilder_ == null) {
                    this.infoList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.infoListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return PlayerWorldSceneInfoListNotifyOuterClass.internal_static_PlayerWorldSceneInfoListNotify_descriptor;
            }
            
            @Override
            public PlayerWorldSceneInfoListNotify getDefaultInstanceForType() {
                return PlayerWorldSceneInfoListNotify.getDefaultInstance();
            }
            
            @Override
            public PlayerWorldSceneInfoListNotify build() {
                final PlayerWorldSceneInfoListNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public PlayerWorldSceneInfoListNotify buildPartial() {
                final PlayerWorldSceneInfoListNotify result = new PlayerWorldSceneInfoListNotify(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.infoListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.infoList_ = Collections.unmodifiableList((List<? extends PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo>)this.infoList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.infoList_ = this.infoList_;
                }
                else {
                    result.infoList_ = this.infoListBuilder_.build();
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
                if (other instanceof PlayerWorldSceneInfoListNotify) {
                    return this.mergeFrom((PlayerWorldSceneInfoListNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final PlayerWorldSceneInfoListNotify other) {
                if (other == PlayerWorldSceneInfoListNotify.getDefaultInstance()) {
                    return this;
                }
                if (this.infoListBuilder_ == null) {
                    if (!other.infoList_.isEmpty()) {
                        if (this.infoList_.isEmpty()) {
                            this.infoList_ = other.infoList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureInfoListIsMutable();
                            this.infoList_.addAll(other.infoList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.infoList_.isEmpty()) {
                    if (this.infoListBuilder_.isEmpty()) {
                        this.infoListBuilder_.dispose();
                        this.infoListBuilder_ = null;
                        this.infoList_ = other.infoList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.infoListBuilder_ = (PlayerWorldSceneInfoListNotify.alwaysUseFieldBuilders ? this.getInfoListFieldBuilder() : null);
                    }
                    else {
                        this.infoListBuilder_.addAllMessages(other.infoList_);
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
                PlayerWorldSceneInfoListNotify parsedMessage = null;
                try {
                    parsedMessage = PlayerWorldSceneInfoListNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (PlayerWorldSceneInfoListNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureInfoListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.infoList_ = new ArrayList<PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo>(this.infoList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo> getInfoListList() {
                if (this.infoListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo>)this.infoList_);
                }
                return this.infoListBuilder_.getMessageList();
            }
            
            @Override
            public int getInfoListCount() {
                if (this.infoListBuilder_ == null) {
                    return this.infoList_.size();
                }
                return this.infoListBuilder_.getCount();
            }
            
            @Override
            public PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo getInfoList(final int index) {
                if (this.infoListBuilder_ == null) {
                    return this.infoList_.get(index);
                }
                return this.infoListBuilder_.getMessage(index);
            }
            
            public Builder setInfoList(final int index, final PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo value) {
                if (this.infoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureInfoListIsMutable();
                    this.infoList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.infoListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setInfoList(final int index, final PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo.Builder builderForValue) {
                if (this.infoListBuilder_ == null) {
                    this.ensureInfoListIsMutable();
                    this.infoList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.infoListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addInfoList(final PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo value) {
                if (this.infoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureInfoListIsMutable();
                    this.infoList_.add(value);
                    this.onChanged();
                }
                else {
                    this.infoListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addInfoList(final int index, final PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo value) {
                if (this.infoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureInfoListIsMutable();
                    this.infoList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.infoListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addInfoList(final PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo.Builder builderForValue) {
                if (this.infoListBuilder_ == null) {
                    this.ensureInfoListIsMutable();
                    this.infoList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.infoListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addInfoList(final int index, final PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo.Builder builderForValue) {
                if (this.infoListBuilder_ == null) {
                    this.ensureInfoListIsMutable();
                    this.infoList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.infoListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllInfoList(final Iterable<? extends PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo> values) {
                if (this.infoListBuilder_ == null) {
                    this.ensureInfoListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.infoList_);
                    this.onChanged();
                }
                else {
                    this.infoListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearInfoList() {
                if (this.infoListBuilder_ == null) {
                    this.infoList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.infoListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeInfoList(final int index) {
                if (this.infoListBuilder_ == null) {
                    this.ensureInfoListIsMutable();
                    this.infoList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.infoListBuilder_.remove(index);
                }
                return this;
            }
            
            public PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo.Builder getInfoListBuilder(final int index) {
                return this.getInfoListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfoOrBuilder getInfoListOrBuilder(final int index) {
                if (this.infoListBuilder_ == null) {
                    return this.infoList_.get(index);
                }
                return this.infoListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfoOrBuilder> getInfoListOrBuilderList() {
                if (this.infoListBuilder_ != null) {
                    return this.infoListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfoOrBuilder>)this.infoList_);
            }
            
            public PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo.Builder addInfoListBuilder() {
                return this.getInfoListFieldBuilder().addBuilder(PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo.getDefaultInstance());
            }
            
            public PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo.Builder addInfoListBuilder(final int index) {
                return this.getInfoListFieldBuilder().addBuilder(index, PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo.getDefaultInstance());
            }
            
            public List<PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo.Builder> getInfoListBuilderList() {
                return this.getInfoListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo, PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo.Builder, PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfoOrBuilder> getInfoListFieldBuilder() {
                if (this.infoListBuilder_ == null) {
                    this.infoListBuilder_ = new RepeatedFieldBuilderV3<PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo, PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo.Builder, PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfoOrBuilder>(this.infoList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.infoList_ = null;
                }
                return this.infoListBuilder_;
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
    
    public interface PlayerWorldSceneInfoListNotifyOrBuilder extends MessageOrBuilder
    {
        List<PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo> getInfoListList();
        
        PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo getInfoList(final int p0);
        
        int getInfoListCount();
        
        List<? extends PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfoOrBuilder> getInfoListOrBuilderList();
        
        PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfoOrBuilder getInfoListOrBuilder(final int p0);
    }
}
