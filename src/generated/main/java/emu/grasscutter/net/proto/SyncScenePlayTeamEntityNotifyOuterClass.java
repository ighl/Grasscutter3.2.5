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

public final class SyncScenePlayTeamEntityNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_SyncScenePlayTeamEntityNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_SyncScenePlayTeamEntityNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private SyncScenePlayTeamEntityNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return SyncScenePlayTeamEntityNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n#SyncScenePlayTeamEntityNotify.proto\u001a\u0018PlayTeamEntityInfo.proto\"`\n\u001dSyncScenePlayTeamEntityNotify\u0012\u0010\n\bscene_id\u0018\t \u0001(\r\u0012-\n\u0010entity_info_list\u0018\u0007 \u0003(\u000b2\u0013.PlayTeamEntityInfoB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        SyncScenePlayTeamEntityNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { PlayTeamEntityInfoOuterClass.getDescriptor() });
        internal_static_SyncScenePlayTeamEntityNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_SyncScenePlayTeamEntityNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(SyncScenePlayTeamEntityNotifyOuterClass.internal_static_SyncScenePlayTeamEntityNotify_descriptor, new String[] { "SceneId", "EntityInfoList" });
        PlayTeamEntityInfoOuterClass.getDescriptor();
    }
    
    public static final class SyncScenePlayTeamEntityNotify extends GeneratedMessageV3 implements SyncScenePlayTeamEntityNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int SCENE_ID_FIELD_NUMBER = 9;
        private int sceneId_;
        public static final int ENTITY_INFO_LIST_FIELD_NUMBER = 7;
        private List<PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo> entityInfoList_;
        private byte memoizedIsInitialized;
        private static final SyncScenePlayTeamEntityNotify DEFAULT_INSTANCE;
        private static final Parser<SyncScenePlayTeamEntityNotify> PARSER;
        
        private SyncScenePlayTeamEntityNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private SyncScenePlayTeamEntityNotify() {
            this.memoizedIsInitialized = -1;
            this.entityInfoList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new SyncScenePlayTeamEntityNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private SyncScenePlayTeamEntityNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 58: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.entityInfoList_ = new ArrayList<PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.entityInfoList_.add(input.readMessage(PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo.parser(), extensionRegistry));
                            continue;
                        }
                        case 72: {
                            this.sceneId_ = input.readUInt32();
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
                    this.entityInfoList_ = Collections.unmodifiableList((List<? extends PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo>)this.entityInfoList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return SyncScenePlayTeamEntityNotifyOuterClass.internal_static_SyncScenePlayTeamEntityNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return SyncScenePlayTeamEntityNotifyOuterClass.internal_static_SyncScenePlayTeamEntityNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(SyncScenePlayTeamEntityNotify.class, Builder.class);
        }
        
        @Override
        public int getSceneId() {
            return this.sceneId_;
        }
        
        @Override
        public List<PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo> getEntityInfoListList() {
            return this.entityInfoList_;
        }
        
        @Override
        public List<? extends PlayTeamEntityInfoOuterClass.PlayTeamEntityInfoOrBuilder> getEntityInfoListOrBuilderList() {
            return this.entityInfoList_;
        }
        
        @Override
        public int getEntityInfoListCount() {
            return this.entityInfoList_.size();
        }
        
        @Override
        public PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo getEntityInfoList(final int index) {
            return this.entityInfoList_.get(index);
        }
        
        @Override
        public PlayTeamEntityInfoOuterClass.PlayTeamEntityInfoOrBuilder getEntityInfoListOrBuilder(final int index) {
            return this.entityInfoList_.get(index);
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
            for (int i = 0; i < this.entityInfoList_.size(); ++i) {
                output.writeMessage(7, this.entityInfoList_.get(i));
            }
            if (this.sceneId_ != 0) {
                output.writeUInt32(9, this.sceneId_);
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
            for (int i = 0; i < this.entityInfoList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(7, this.entityInfoList_.get(i));
            }
            if (this.sceneId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.sceneId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SyncScenePlayTeamEntityNotify)) {
                return super.equals(obj);
            }
            final SyncScenePlayTeamEntityNotify other = (SyncScenePlayTeamEntityNotify)obj;
            return this.getSceneId() == other.getSceneId() && this.getEntityInfoListList().equals(other.getEntityInfoListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getSceneId();
            if (this.getEntityInfoListCount() > 0) {
                hash = 37 * hash + 7;
                hash = 53 * hash + this.getEntityInfoListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static SyncScenePlayTeamEntityNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return SyncScenePlayTeamEntityNotify.PARSER.parseFrom(data);
        }
        
        public static SyncScenePlayTeamEntityNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SyncScenePlayTeamEntityNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SyncScenePlayTeamEntityNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return SyncScenePlayTeamEntityNotify.PARSER.parseFrom(data);
        }
        
        public static SyncScenePlayTeamEntityNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SyncScenePlayTeamEntityNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SyncScenePlayTeamEntityNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return SyncScenePlayTeamEntityNotify.PARSER.parseFrom(data);
        }
        
        public static SyncScenePlayTeamEntityNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SyncScenePlayTeamEntityNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SyncScenePlayTeamEntityNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SyncScenePlayTeamEntityNotify.PARSER, input);
        }
        
        public static SyncScenePlayTeamEntityNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SyncScenePlayTeamEntityNotify.PARSER, input, extensionRegistry);
        }
        
        public static SyncScenePlayTeamEntityNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SyncScenePlayTeamEntityNotify.PARSER, input);
        }
        
        public static SyncScenePlayTeamEntityNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SyncScenePlayTeamEntityNotify.PARSER, input, extensionRegistry);
        }
        
        public static SyncScenePlayTeamEntityNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SyncScenePlayTeamEntityNotify.PARSER, input);
        }
        
        public static SyncScenePlayTeamEntityNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SyncScenePlayTeamEntityNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return SyncScenePlayTeamEntityNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final SyncScenePlayTeamEntityNotify prototype) {
            return SyncScenePlayTeamEntityNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == SyncScenePlayTeamEntityNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static SyncScenePlayTeamEntityNotify getDefaultInstance() {
            return SyncScenePlayTeamEntityNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<SyncScenePlayTeamEntityNotify> parser() {
            return SyncScenePlayTeamEntityNotify.PARSER;
        }
        
        @Override
        public Parser<SyncScenePlayTeamEntityNotify> getParserForType() {
            return SyncScenePlayTeamEntityNotify.PARSER;
        }
        
        @Override
        public SyncScenePlayTeamEntityNotify getDefaultInstanceForType() {
            return SyncScenePlayTeamEntityNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new SyncScenePlayTeamEntityNotify();
            PARSER = new AbstractParser<SyncScenePlayTeamEntityNotify>() {
                @Override
                public SyncScenePlayTeamEntityNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new SyncScenePlayTeamEntityNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SyncScenePlayTeamEntityNotifyOrBuilder
        {
            private int bitField0_;
            private int sceneId_;
            private List<PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo> entityInfoList_;
            private RepeatedFieldBuilderV3<PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo, PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo.Builder, PlayTeamEntityInfoOuterClass.PlayTeamEntityInfoOrBuilder> entityInfoListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return SyncScenePlayTeamEntityNotifyOuterClass.internal_static_SyncScenePlayTeamEntityNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return SyncScenePlayTeamEntityNotifyOuterClass.internal_static_SyncScenePlayTeamEntityNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(SyncScenePlayTeamEntityNotify.class, Builder.class);
            }
            
            private Builder() {
                this.entityInfoList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.entityInfoList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (SyncScenePlayTeamEntityNotify.alwaysUseFieldBuilders) {
                    this.getEntityInfoListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.sceneId_ = 0;
                if (this.entityInfoListBuilder_ == null) {
                    this.entityInfoList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.entityInfoListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return SyncScenePlayTeamEntityNotifyOuterClass.internal_static_SyncScenePlayTeamEntityNotify_descriptor;
            }
            
            @Override
            public SyncScenePlayTeamEntityNotify getDefaultInstanceForType() {
                return SyncScenePlayTeamEntityNotify.getDefaultInstance();
            }
            
            @Override
            public SyncScenePlayTeamEntityNotify build() {
                final SyncScenePlayTeamEntityNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public SyncScenePlayTeamEntityNotify buildPartial() {
                final SyncScenePlayTeamEntityNotify result = new SyncScenePlayTeamEntityNotify(this);
                final int from_bitField0_ = this.bitField0_;
                result.sceneId_ = this.sceneId_;
                if (this.entityInfoListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.entityInfoList_ = Collections.unmodifiableList((List<? extends PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo>)this.entityInfoList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.entityInfoList_ = this.entityInfoList_;
                }
                else {
                    result.entityInfoList_ = this.entityInfoListBuilder_.build();
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
                if (other instanceof SyncScenePlayTeamEntityNotify) {
                    return this.mergeFrom((SyncScenePlayTeamEntityNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final SyncScenePlayTeamEntityNotify other) {
                if (other == SyncScenePlayTeamEntityNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getSceneId() != 0) {
                    this.setSceneId(other.getSceneId());
                }
                if (this.entityInfoListBuilder_ == null) {
                    if (!other.entityInfoList_.isEmpty()) {
                        if (this.entityInfoList_.isEmpty()) {
                            this.entityInfoList_ = other.entityInfoList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureEntityInfoListIsMutable();
                            this.entityInfoList_.addAll(other.entityInfoList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.entityInfoList_.isEmpty()) {
                    if (this.entityInfoListBuilder_.isEmpty()) {
                        this.entityInfoListBuilder_.dispose();
                        this.entityInfoListBuilder_ = null;
                        this.entityInfoList_ = other.entityInfoList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.entityInfoListBuilder_ = (SyncScenePlayTeamEntityNotify.alwaysUseFieldBuilders ? this.getEntityInfoListFieldBuilder() : null);
                    }
                    else {
                        this.entityInfoListBuilder_.addAllMessages(other.entityInfoList_);
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
                SyncScenePlayTeamEntityNotify parsedMessage = null;
                try {
                    parsedMessage = SyncScenePlayTeamEntityNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (SyncScenePlayTeamEntityNotify)e.getUnfinishedMessage();
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
            public int getSceneId() {
                return this.sceneId_;
            }
            
            public Builder setSceneId(final int value) {
                this.sceneId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSceneId() {
                this.sceneId_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureEntityInfoListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.entityInfoList_ = new ArrayList<PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo>(this.entityInfoList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo> getEntityInfoListList() {
                if (this.entityInfoListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo>)this.entityInfoList_);
                }
                return this.entityInfoListBuilder_.getMessageList();
            }
            
            @Override
            public int getEntityInfoListCount() {
                if (this.entityInfoListBuilder_ == null) {
                    return this.entityInfoList_.size();
                }
                return this.entityInfoListBuilder_.getCount();
            }
            
            @Override
            public PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo getEntityInfoList(final int index) {
                if (this.entityInfoListBuilder_ == null) {
                    return this.entityInfoList_.get(index);
                }
                return this.entityInfoListBuilder_.getMessage(index);
            }
            
            public Builder setEntityInfoList(final int index, final PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo value) {
                if (this.entityInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureEntityInfoListIsMutable();
                    this.entityInfoList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.entityInfoListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setEntityInfoList(final int index, final PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo.Builder builderForValue) {
                if (this.entityInfoListBuilder_ == null) {
                    this.ensureEntityInfoListIsMutable();
                    this.entityInfoList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.entityInfoListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addEntityInfoList(final PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo value) {
                if (this.entityInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureEntityInfoListIsMutable();
                    this.entityInfoList_.add(value);
                    this.onChanged();
                }
                else {
                    this.entityInfoListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addEntityInfoList(final int index, final PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo value) {
                if (this.entityInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureEntityInfoListIsMutable();
                    this.entityInfoList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.entityInfoListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addEntityInfoList(final PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo.Builder builderForValue) {
                if (this.entityInfoListBuilder_ == null) {
                    this.ensureEntityInfoListIsMutable();
                    this.entityInfoList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.entityInfoListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addEntityInfoList(final int index, final PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo.Builder builderForValue) {
                if (this.entityInfoListBuilder_ == null) {
                    this.ensureEntityInfoListIsMutable();
                    this.entityInfoList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.entityInfoListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllEntityInfoList(final Iterable<? extends PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo> values) {
                if (this.entityInfoListBuilder_ == null) {
                    this.ensureEntityInfoListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.entityInfoList_);
                    this.onChanged();
                }
                else {
                    this.entityInfoListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearEntityInfoList() {
                if (this.entityInfoListBuilder_ == null) {
                    this.entityInfoList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.entityInfoListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeEntityInfoList(final int index) {
                if (this.entityInfoListBuilder_ == null) {
                    this.ensureEntityInfoListIsMutable();
                    this.entityInfoList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.entityInfoListBuilder_.remove(index);
                }
                return this;
            }
            
            public PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo.Builder getEntityInfoListBuilder(final int index) {
                return this.getEntityInfoListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public PlayTeamEntityInfoOuterClass.PlayTeamEntityInfoOrBuilder getEntityInfoListOrBuilder(final int index) {
                if (this.entityInfoListBuilder_ == null) {
                    return this.entityInfoList_.get(index);
                }
                return this.entityInfoListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends PlayTeamEntityInfoOuterClass.PlayTeamEntityInfoOrBuilder> getEntityInfoListOrBuilderList() {
                if (this.entityInfoListBuilder_ != null) {
                    return this.entityInfoListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends PlayTeamEntityInfoOuterClass.PlayTeamEntityInfoOrBuilder>)this.entityInfoList_);
            }
            
            public PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo.Builder addEntityInfoListBuilder() {
                return this.getEntityInfoListFieldBuilder().addBuilder(PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo.getDefaultInstance());
            }
            
            public PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo.Builder addEntityInfoListBuilder(final int index) {
                return this.getEntityInfoListFieldBuilder().addBuilder(index, PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo.getDefaultInstance());
            }
            
            public List<PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo.Builder> getEntityInfoListBuilderList() {
                return this.getEntityInfoListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo, PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo.Builder, PlayTeamEntityInfoOuterClass.PlayTeamEntityInfoOrBuilder> getEntityInfoListFieldBuilder() {
                if (this.entityInfoListBuilder_ == null) {
                    this.entityInfoListBuilder_ = new RepeatedFieldBuilderV3<PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo, PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo.Builder, PlayTeamEntityInfoOuterClass.PlayTeamEntityInfoOrBuilder>(this.entityInfoList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.entityInfoList_ = null;
                }
                return this.entityInfoListBuilder_;
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
    
    public interface SyncScenePlayTeamEntityNotifyOrBuilder extends MessageOrBuilder
    {
        int getSceneId();
        
        List<PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo> getEntityInfoListList();
        
        PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo getEntityInfoList(final int p0);
        
        int getEntityInfoListCount();
        
        List<? extends PlayTeamEntityInfoOuterClass.PlayTeamEntityInfoOrBuilder> getEntityInfoListOrBuilderList();
        
        PlayTeamEntityInfoOuterClass.PlayTeamEntityInfoOrBuilder getEntityInfoListOrBuilder(final int p0);
    }
}
