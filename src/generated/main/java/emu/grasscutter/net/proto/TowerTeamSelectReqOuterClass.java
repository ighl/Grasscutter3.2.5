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

public final class TowerTeamSelectReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_TowerTeamSelectReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_TowerTeamSelectReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private TowerTeamSelectReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return TowerTeamSelectReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0018TowerTeamSelectReq.proto\u001a\u000fTowerTeam.proto\"K\n\u0012TowerTeamSelectReq\u0012#\n\u000ftower_team_list\u0018\u000b \u0003(\u000b2\n.TowerTeam\u0012\u0010\n\bfloor_id\u0018\n \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        TowerTeamSelectReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { TowerTeamOuterClass.getDescriptor() });
        internal_static_TowerTeamSelectReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_TowerTeamSelectReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(TowerTeamSelectReqOuterClass.internal_static_TowerTeamSelectReq_descriptor, new String[] { "TowerTeamList", "FloorId" });
        TowerTeamOuterClass.getDescriptor();
    }
    
    public static final class TowerTeamSelectReq extends GeneratedMessageV3 implements TowerTeamSelectReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int TOWER_TEAM_LIST_FIELD_NUMBER = 11;
        private List<TowerTeamOuterClass.TowerTeam> towerTeamList_;
        public static final int FLOOR_ID_FIELD_NUMBER = 10;
        private int floorId_;
        private byte memoizedIsInitialized;
        private static final TowerTeamSelectReq DEFAULT_INSTANCE;
        private static final Parser<TowerTeamSelectReq> PARSER;
        
        private TowerTeamSelectReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private TowerTeamSelectReq() {
            this.memoizedIsInitialized = -1;
            this.towerTeamList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new TowerTeamSelectReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private TowerTeamSelectReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 80: {
                            this.floorId_ = input.readUInt32();
                            continue;
                        }
                        case 90: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.towerTeamList_ = new ArrayList<TowerTeamOuterClass.TowerTeam>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.towerTeamList_.add(input.readMessage(TowerTeamOuterClass.TowerTeam.parser(), extensionRegistry));
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
                    this.towerTeamList_ = Collections.unmodifiableList((List<? extends TowerTeamOuterClass.TowerTeam>)this.towerTeamList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return TowerTeamSelectReqOuterClass.internal_static_TowerTeamSelectReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return TowerTeamSelectReqOuterClass.internal_static_TowerTeamSelectReq_fieldAccessorTable.ensureFieldAccessorsInitialized(TowerTeamSelectReq.class, Builder.class);
        }
        
        @Override
        public List<TowerTeamOuterClass.TowerTeam> getTowerTeamListList() {
            return this.towerTeamList_;
        }
        
        @Override
        public List<? extends TowerTeamOuterClass.TowerTeamOrBuilder> getTowerTeamListOrBuilderList() {
            return this.towerTeamList_;
        }
        
        @Override
        public int getTowerTeamListCount() {
            return this.towerTeamList_.size();
        }
        
        @Override
        public TowerTeamOuterClass.TowerTeam getTowerTeamList(final int index) {
            return this.towerTeamList_.get(index);
        }
        
        @Override
        public TowerTeamOuterClass.TowerTeamOrBuilder getTowerTeamListOrBuilder(final int index) {
            return this.towerTeamList_.get(index);
        }
        
        @Override
        public int getFloorId() {
            return this.floorId_;
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
            if (this.floorId_ != 0) {
                output.writeUInt32(10, this.floorId_);
            }
            for (int i = 0; i < this.towerTeamList_.size(); ++i) {
                output.writeMessage(11, this.towerTeamList_.get(i));
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
            if (this.floorId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(10, this.floorId_);
            }
            for (int i = 0; i < this.towerTeamList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(11, this.towerTeamList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TowerTeamSelectReq)) {
                return super.equals(obj);
            }
            final TowerTeamSelectReq other = (TowerTeamSelectReq)obj;
            return this.getTowerTeamListList().equals(other.getTowerTeamListList()) && this.getFloorId() == other.getFloorId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getTowerTeamListCount() > 0) {
                hash = 37 * hash + 11;
                hash = 53 * hash + this.getTowerTeamListList().hashCode();
            }
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getFloorId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static TowerTeamSelectReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return TowerTeamSelectReq.PARSER.parseFrom(data);
        }
        
        public static TowerTeamSelectReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TowerTeamSelectReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TowerTeamSelectReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return TowerTeamSelectReq.PARSER.parseFrom(data);
        }
        
        public static TowerTeamSelectReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TowerTeamSelectReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TowerTeamSelectReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return TowerTeamSelectReq.PARSER.parseFrom(data);
        }
        
        public static TowerTeamSelectReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TowerTeamSelectReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TowerTeamSelectReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerTeamSelectReq.PARSER, input);
        }
        
        public static TowerTeamSelectReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerTeamSelectReq.PARSER, input, extensionRegistry);
        }
        
        public static TowerTeamSelectReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TowerTeamSelectReq.PARSER, input);
        }
        
        public static TowerTeamSelectReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TowerTeamSelectReq.PARSER, input, extensionRegistry);
        }
        
        public static TowerTeamSelectReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerTeamSelectReq.PARSER, input);
        }
        
        public static TowerTeamSelectReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerTeamSelectReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return TowerTeamSelectReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final TowerTeamSelectReq prototype) {
            return TowerTeamSelectReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == TowerTeamSelectReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static TowerTeamSelectReq getDefaultInstance() {
            return TowerTeamSelectReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<TowerTeamSelectReq> parser() {
            return TowerTeamSelectReq.PARSER;
        }
        
        @Override
        public Parser<TowerTeamSelectReq> getParserForType() {
            return TowerTeamSelectReq.PARSER;
        }
        
        @Override
        public TowerTeamSelectReq getDefaultInstanceForType() {
            return TowerTeamSelectReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new TowerTeamSelectReq();
            PARSER = new AbstractParser<TowerTeamSelectReq>() {
                @Override
                public TowerTeamSelectReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new TowerTeamSelectReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TowerTeamSelectReqOrBuilder
        {
            private int bitField0_;
            private List<TowerTeamOuterClass.TowerTeam> towerTeamList_;
            private RepeatedFieldBuilderV3<TowerTeamOuterClass.TowerTeam, TowerTeamOuterClass.TowerTeam.Builder, TowerTeamOuterClass.TowerTeamOrBuilder> towerTeamListBuilder_;
            private int floorId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return TowerTeamSelectReqOuterClass.internal_static_TowerTeamSelectReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return TowerTeamSelectReqOuterClass.internal_static_TowerTeamSelectReq_fieldAccessorTable.ensureFieldAccessorsInitialized(TowerTeamSelectReq.class, Builder.class);
            }
            
            private Builder() {
                this.towerTeamList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.towerTeamList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (TowerTeamSelectReq.alwaysUseFieldBuilders) {
                    this.getTowerTeamListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.towerTeamListBuilder_ == null) {
                    this.towerTeamList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.towerTeamListBuilder_.clear();
                }
                this.floorId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return TowerTeamSelectReqOuterClass.internal_static_TowerTeamSelectReq_descriptor;
            }
            
            @Override
            public TowerTeamSelectReq getDefaultInstanceForType() {
                return TowerTeamSelectReq.getDefaultInstance();
            }
            
            @Override
            public TowerTeamSelectReq build() {
                final TowerTeamSelectReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public TowerTeamSelectReq buildPartial() {
                final TowerTeamSelectReq result = new TowerTeamSelectReq(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.towerTeamListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.towerTeamList_ = Collections.unmodifiableList((List<? extends TowerTeamOuterClass.TowerTeam>)this.towerTeamList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.towerTeamList_ = this.towerTeamList_;
                }
                else {
                    result.towerTeamList_ = this.towerTeamListBuilder_.build();
                }
                result.floorId_ = this.floorId_;
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
                if (other instanceof TowerTeamSelectReq) {
                    return this.mergeFrom((TowerTeamSelectReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final TowerTeamSelectReq other) {
                if (other == TowerTeamSelectReq.getDefaultInstance()) {
                    return this;
                }
                if (this.towerTeamListBuilder_ == null) {
                    if (!other.towerTeamList_.isEmpty()) {
                        if (this.towerTeamList_.isEmpty()) {
                            this.towerTeamList_ = other.towerTeamList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureTowerTeamListIsMutable();
                            this.towerTeamList_.addAll(other.towerTeamList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.towerTeamList_.isEmpty()) {
                    if (this.towerTeamListBuilder_.isEmpty()) {
                        this.towerTeamListBuilder_.dispose();
                        this.towerTeamListBuilder_ = null;
                        this.towerTeamList_ = other.towerTeamList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.towerTeamListBuilder_ = (TowerTeamSelectReq.alwaysUseFieldBuilders ? this.getTowerTeamListFieldBuilder() : null);
                    }
                    else {
                        this.towerTeamListBuilder_.addAllMessages(other.towerTeamList_);
                    }
                }
                if (other.getFloorId() != 0) {
                    this.setFloorId(other.getFloorId());
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
                TowerTeamSelectReq parsedMessage = null;
                try {
                    parsedMessage = TowerTeamSelectReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (TowerTeamSelectReq)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureTowerTeamListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.towerTeamList_ = new ArrayList<TowerTeamOuterClass.TowerTeam>(this.towerTeamList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<TowerTeamOuterClass.TowerTeam> getTowerTeamListList() {
                if (this.towerTeamListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends TowerTeamOuterClass.TowerTeam>)this.towerTeamList_);
                }
                return this.towerTeamListBuilder_.getMessageList();
            }
            
            @Override
            public int getTowerTeamListCount() {
                if (this.towerTeamListBuilder_ == null) {
                    return this.towerTeamList_.size();
                }
                return this.towerTeamListBuilder_.getCount();
            }
            
            @Override
            public TowerTeamOuterClass.TowerTeam getTowerTeamList(final int index) {
                if (this.towerTeamListBuilder_ == null) {
                    return this.towerTeamList_.get(index);
                }
                return this.towerTeamListBuilder_.getMessage(index);
            }
            
            public Builder setTowerTeamList(final int index, final TowerTeamOuterClass.TowerTeam value) {
                if (this.towerTeamListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureTowerTeamListIsMutable();
                    this.towerTeamList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.towerTeamListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setTowerTeamList(final int index, final TowerTeamOuterClass.TowerTeam.Builder builderForValue) {
                if (this.towerTeamListBuilder_ == null) {
                    this.ensureTowerTeamListIsMutable();
                    this.towerTeamList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.towerTeamListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addTowerTeamList(final TowerTeamOuterClass.TowerTeam value) {
                if (this.towerTeamListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureTowerTeamListIsMutable();
                    this.towerTeamList_.add(value);
                    this.onChanged();
                }
                else {
                    this.towerTeamListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addTowerTeamList(final int index, final TowerTeamOuterClass.TowerTeam value) {
                if (this.towerTeamListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureTowerTeamListIsMutable();
                    this.towerTeamList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.towerTeamListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addTowerTeamList(final TowerTeamOuterClass.TowerTeam.Builder builderForValue) {
                if (this.towerTeamListBuilder_ == null) {
                    this.ensureTowerTeamListIsMutable();
                    this.towerTeamList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.towerTeamListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addTowerTeamList(final int index, final TowerTeamOuterClass.TowerTeam.Builder builderForValue) {
                if (this.towerTeamListBuilder_ == null) {
                    this.ensureTowerTeamListIsMutable();
                    this.towerTeamList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.towerTeamListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllTowerTeamList(final Iterable<? extends TowerTeamOuterClass.TowerTeam> values) {
                if (this.towerTeamListBuilder_ == null) {
                    this.ensureTowerTeamListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.towerTeamList_);
                    this.onChanged();
                }
                else {
                    this.towerTeamListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearTowerTeamList() {
                if (this.towerTeamListBuilder_ == null) {
                    this.towerTeamList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.towerTeamListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeTowerTeamList(final int index) {
                if (this.towerTeamListBuilder_ == null) {
                    this.ensureTowerTeamListIsMutable();
                    this.towerTeamList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.towerTeamListBuilder_.remove(index);
                }
                return this;
            }
            
            public TowerTeamOuterClass.TowerTeam.Builder getTowerTeamListBuilder(final int index) {
                return this.getTowerTeamListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public TowerTeamOuterClass.TowerTeamOrBuilder getTowerTeamListOrBuilder(final int index) {
                if (this.towerTeamListBuilder_ == null) {
                    return this.towerTeamList_.get(index);
                }
                return this.towerTeamListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends TowerTeamOuterClass.TowerTeamOrBuilder> getTowerTeamListOrBuilderList() {
                if (this.towerTeamListBuilder_ != null) {
                    return this.towerTeamListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends TowerTeamOuterClass.TowerTeamOrBuilder>)this.towerTeamList_);
            }
            
            public TowerTeamOuterClass.TowerTeam.Builder addTowerTeamListBuilder() {
                return this.getTowerTeamListFieldBuilder().addBuilder(TowerTeamOuterClass.TowerTeam.getDefaultInstance());
            }
            
            public TowerTeamOuterClass.TowerTeam.Builder addTowerTeamListBuilder(final int index) {
                return this.getTowerTeamListFieldBuilder().addBuilder(index, TowerTeamOuterClass.TowerTeam.getDefaultInstance());
            }
            
            public List<TowerTeamOuterClass.TowerTeam.Builder> getTowerTeamListBuilderList() {
                return this.getTowerTeamListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<TowerTeamOuterClass.TowerTeam, TowerTeamOuterClass.TowerTeam.Builder, TowerTeamOuterClass.TowerTeamOrBuilder> getTowerTeamListFieldBuilder() {
                if (this.towerTeamListBuilder_ == null) {
                    this.towerTeamListBuilder_ = new RepeatedFieldBuilderV3<TowerTeamOuterClass.TowerTeam, TowerTeamOuterClass.TowerTeam.Builder, TowerTeamOuterClass.TowerTeamOrBuilder>(this.towerTeamList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.towerTeamList_ = null;
                }
                return this.towerTeamListBuilder_;
            }
            
            @Override
            public int getFloorId() {
                return this.floorId_;
            }
            
            public Builder setFloorId(final int value) {
                this.floorId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearFloorId() {
                this.floorId_ = 0;
                this.onChanged();
                return this;
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
    
    public interface TowerTeamSelectReqOrBuilder extends MessageOrBuilder
    {
        List<TowerTeamOuterClass.TowerTeam> getTowerTeamListList();
        
        TowerTeamOuterClass.TowerTeam getTowerTeamList(final int p0);
        
        int getTowerTeamListCount();
        
        List<? extends TowerTeamOuterClass.TowerTeamOrBuilder> getTowerTeamListOrBuilderList();
        
        TowerTeamOuterClass.TowerTeamOrBuilder getTowerTeamListOrBuilder(final int p0);
        
        int getFloorId();
    }
}
