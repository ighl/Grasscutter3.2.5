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

public final class SceneEntityAppearNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_SceneEntityAppearNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_SceneEntityAppearNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private SceneEntityAppearNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return SceneEntityAppearNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001dSceneEntityAppearNotify.proto\u001a\u0015SceneEntityInfo.proto\u001a\u0010VisionType.proto\"q\n\u0017SceneEntityAppearNotify\u0012 \n\u000bappear_type\u0018\u0006 \u0001(\u000e2\u000b.VisionType\u0012\r\n\u0005param\u0018\n \u0001(\r\u0012%\n\u000bentity_list\u0018\t \u0003(\u000b2\u0010.SceneEntityInfoB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        SceneEntityAppearNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { SceneEntityInfoOuterClass.getDescriptor(), VisionTypeOuterClass.getDescriptor() });
        internal_static_SceneEntityAppearNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_SceneEntityAppearNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(SceneEntityAppearNotifyOuterClass.internal_static_SceneEntityAppearNotify_descriptor, new String[] { "AppearType", "Param", "EntityList" });
        SceneEntityInfoOuterClass.getDescriptor();
        VisionTypeOuterClass.getDescriptor();
    }
    
    public static final class SceneEntityAppearNotify extends GeneratedMessageV3 implements SceneEntityAppearNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int APPEAR_TYPE_FIELD_NUMBER = 6;
        private int appearType_;
        public static final int PARAM_FIELD_NUMBER = 10;
        private int param_;
        public static final int ENTITY_LIST_FIELD_NUMBER = 9;
        private List<SceneEntityInfoOuterClass.SceneEntityInfo> entityList_;
        private byte memoizedIsInitialized;
        private static final SceneEntityAppearNotify DEFAULT_INSTANCE;
        private static final Parser<SceneEntityAppearNotify> PARSER;
        
        private SceneEntityAppearNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private SceneEntityAppearNotify() {
            this.memoizedIsInitialized = -1;
            this.appearType_ = 0;
            this.entityList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new SceneEntityAppearNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private SceneEntityAppearNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 48: {
                            final int rawValue = input.readEnum();
                            this.appearType_ = rawValue;
                            continue;
                        }
                        case 74: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.entityList_ = new ArrayList<SceneEntityInfoOuterClass.SceneEntityInfo>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.entityList_.add(input.readMessage(SceneEntityInfoOuterClass.SceneEntityInfo.parser(), extensionRegistry));
                            continue;
                        }
                        case 80: {
                            this.param_ = input.readUInt32();
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
                    this.entityList_ = Collections.unmodifiableList((List<? extends SceneEntityInfoOuterClass.SceneEntityInfo>)this.entityList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return SceneEntityAppearNotifyOuterClass.internal_static_SceneEntityAppearNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return SceneEntityAppearNotifyOuterClass.internal_static_SceneEntityAppearNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(SceneEntityAppearNotify.class, Builder.class);
        }
        
        @Override
        public int getAppearTypeValue() {
            return this.appearType_;
        }
        
        @Override
        public VisionTypeOuterClass.VisionType getAppearType() {
            final VisionTypeOuterClass.VisionType result = VisionTypeOuterClass.VisionType.valueOf(this.appearType_);
            return (result == null) ? VisionTypeOuterClass.VisionType.UNRECOGNIZED : result;
        }
        
        @Override
        public int getParam() {
            return this.param_;
        }
        
        @Override
        public List<SceneEntityInfoOuterClass.SceneEntityInfo> getEntityListList() {
            return this.entityList_;
        }
        
        @Override
        public List<? extends SceneEntityInfoOuterClass.SceneEntityInfoOrBuilder> getEntityListOrBuilderList() {
            return this.entityList_;
        }
        
        @Override
        public int getEntityListCount() {
            return this.entityList_.size();
        }
        
        @Override
        public SceneEntityInfoOuterClass.SceneEntityInfo getEntityList(final int index) {
            return this.entityList_.get(index);
        }
        
        @Override
        public SceneEntityInfoOuterClass.SceneEntityInfoOrBuilder getEntityListOrBuilder(final int index) {
            return this.entityList_.get(index);
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
            if (this.appearType_ != VisionTypeOuterClass.VisionType.VISION_TYPE_NONE.getNumber()) {
                output.writeEnum(6, this.appearType_);
            }
            for (int i = 0; i < this.entityList_.size(); ++i) {
                output.writeMessage(9, this.entityList_.get(i));
            }
            if (this.param_ != 0) {
                output.writeUInt32(10, this.param_);
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
            if (this.appearType_ != VisionTypeOuterClass.VisionType.VISION_TYPE_NONE.getNumber()) {
                size += CodedOutputStream.computeEnumSize(6, this.appearType_);
            }
            for (int i = 0; i < this.entityList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(9, this.entityList_.get(i));
            }
            if (this.param_ != 0) {
                size += CodedOutputStream.computeUInt32Size(10, this.param_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SceneEntityAppearNotify)) {
                return super.equals(obj);
            }
            final SceneEntityAppearNotify other = (SceneEntityAppearNotify)obj;
            return this.appearType_ == other.appearType_ && this.getParam() == other.getParam() && this.getEntityListList().equals(other.getEntityListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.appearType_;
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getParam();
            if (this.getEntityListCount() > 0) {
                hash = 37 * hash + 9;
                hash = 53 * hash + this.getEntityListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static SceneEntityAppearNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return SceneEntityAppearNotify.PARSER.parseFrom(data);
        }
        
        public static SceneEntityAppearNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneEntityAppearNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneEntityAppearNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return SceneEntityAppearNotify.PARSER.parseFrom(data);
        }
        
        public static SceneEntityAppearNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneEntityAppearNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneEntityAppearNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return SceneEntityAppearNotify.PARSER.parseFrom(data);
        }
        
        public static SceneEntityAppearNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneEntityAppearNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneEntityAppearNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneEntityAppearNotify.PARSER, input);
        }
        
        public static SceneEntityAppearNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneEntityAppearNotify.PARSER, input, extensionRegistry);
        }
        
        public static SceneEntityAppearNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SceneEntityAppearNotify.PARSER, input);
        }
        
        public static SceneEntityAppearNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SceneEntityAppearNotify.PARSER, input, extensionRegistry);
        }
        
        public static SceneEntityAppearNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneEntityAppearNotify.PARSER, input);
        }
        
        public static SceneEntityAppearNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneEntityAppearNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return SceneEntityAppearNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final SceneEntityAppearNotify prototype) {
            return SceneEntityAppearNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == SceneEntityAppearNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static SceneEntityAppearNotify getDefaultInstance() {
            return SceneEntityAppearNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<SceneEntityAppearNotify> parser() {
            return SceneEntityAppearNotify.PARSER;
        }
        
        @Override
        public Parser<SceneEntityAppearNotify> getParserForType() {
            return SceneEntityAppearNotify.PARSER;
        }
        
        @Override
        public SceneEntityAppearNotify getDefaultInstanceForType() {
            return SceneEntityAppearNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new SceneEntityAppearNotify();
            PARSER = new AbstractParser<SceneEntityAppearNotify>() {
                @Override
                public SceneEntityAppearNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new SceneEntityAppearNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SceneEntityAppearNotifyOrBuilder
        {
            private int bitField0_;
            private int appearType_;
            private int param_;
            private List<SceneEntityInfoOuterClass.SceneEntityInfo> entityList_;
            private RepeatedFieldBuilderV3<SceneEntityInfoOuterClass.SceneEntityInfo, SceneEntityInfoOuterClass.SceneEntityInfo.Builder, SceneEntityInfoOuterClass.SceneEntityInfoOrBuilder> entityListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return SceneEntityAppearNotifyOuterClass.internal_static_SceneEntityAppearNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return SceneEntityAppearNotifyOuterClass.internal_static_SceneEntityAppearNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(SceneEntityAppearNotify.class, Builder.class);
            }
            
            private Builder() {
                this.appearType_ = 0;
                this.entityList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.appearType_ = 0;
                this.entityList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (SceneEntityAppearNotify.alwaysUseFieldBuilders) {
                    this.getEntityListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.appearType_ = 0;
                this.param_ = 0;
                if (this.entityListBuilder_ == null) {
                    this.entityList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.entityListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return SceneEntityAppearNotifyOuterClass.internal_static_SceneEntityAppearNotify_descriptor;
            }
            
            @Override
            public SceneEntityAppearNotify getDefaultInstanceForType() {
                return SceneEntityAppearNotify.getDefaultInstance();
            }
            
            @Override
            public SceneEntityAppearNotify build() {
                final SceneEntityAppearNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public SceneEntityAppearNotify buildPartial() {
                final SceneEntityAppearNotify result = new SceneEntityAppearNotify(this);
                final int from_bitField0_ = this.bitField0_;
                result.appearType_ = this.appearType_;
                result.param_ = this.param_;
                if (this.entityListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.entityList_ = Collections.unmodifiableList((List<? extends SceneEntityInfoOuterClass.SceneEntityInfo>)this.entityList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.entityList_ = this.entityList_;
                }
                else {
                    result.entityList_ = this.entityListBuilder_.build();
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
                if (other instanceof SceneEntityAppearNotify) {
                    return this.mergeFrom((SceneEntityAppearNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final SceneEntityAppearNotify other) {
                if (other == SceneEntityAppearNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.appearType_ != 0) {
                    this.setAppearTypeValue(other.getAppearTypeValue());
                }
                if (other.getParam() != 0) {
                    this.setParam(other.getParam());
                }
                if (this.entityListBuilder_ == null) {
                    if (!other.entityList_.isEmpty()) {
                        if (this.entityList_.isEmpty()) {
                            this.entityList_ = other.entityList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureEntityListIsMutable();
                            this.entityList_.addAll(other.entityList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.entityList_.isEmpty()) {
                    if (this.entityListBuilder_.isEmpty()) {
                        this.entityListBuilder_.dispose();
                        this.entityListBuilder_ = null;
                        this.entityList_ = other.entityList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.entityListBuilder_ = (SceneEntityAppearNotify.alwaysUseFieldBuilders ? this.getEntityListFieldBuilder() : null);
                    }
                    else {
                        this.entityListBuilder_.addAllMessages(other.entityList_);
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
                SceneEntityAppearNotify parsedMessage = null;
                try {
                    parsedMessage = SceneEntityAppearNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (SceneEntityAppearNotify)e.getUnfinishedMessage();
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
            public int getAppearTypeValue() {
                return this.appearType_;
            }
            
            public Builder setAppearTypeValue(final int value) {
                this.appearType_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public VisionTypeOuterClass.VisionType getAppearType() {
                final VisionTypeOuterClass.VisionType result = VisionTypeOuterClass.VisionType.valueOf(this.appearType_);
                return (result == null) ? VisionTypeOuterClass.VisionType.UNRECOGNIZED : result;
            }
            
            public Builder setAppearType(final VisionTypeOuterClass.VisionType value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.appearType_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearAppearType() {
                this.appearType_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getParam() {
                return this.param_;
            }
            
            public Builder setParam(final int value) {
                this.param_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearParam() {
                this.param_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureEntityListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.entityList_ = new ArrayList<SceneEntityInfoOuterClass.SceneEntityInfo>(this.entityList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<SceneEntityInfoOuterClass.SceneEntityInfo> getEntityListList() {
                if (this.entityListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends SceneEntityInfoOuterClass.SceneEntityInfo>)this.entityList_);
                }
                return this.entityListBuilder_.getMessageList();
            }
            
            @Override
            public int getEntityListCount() {
                if (this.entityListBuilder_ == null) {
                    return this.entityList_.size();
                }
                return this.entityListBuilder_.getCount();
            }
            
            @Override
            public SceneEntityInfoOuterClass.SceneEntityInfo getEntityList(final int index) {
                if (this.entityListBuilder_ == null) {
                    return this.entityList_.get(index);
                }
                return this.entityListBuilder_.getMessage(index);
            }
            
            public Builder setEntityList(final int index, final SceneEntityInfoOuterClass.SceneEntityInfo value) {
                if (this.entityListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureEntityListIsMutable();
                    this.entityList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.entityListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setEntityList(final int index, final SceneEntityInfoOuterClass.SceneEntityInfo.Builder builderForValue) {
                if (this.entityListBuilder_ == null) {
                    this.ensureEntityListIsMutable();
                    this.entityList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.entityListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addEntityList(final SceneEntityInfoOuterClass.SceneEntityInfo value) {
                if (this.entityListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureEntityListIsMutable();
                    this.entityList_.add(value);
                    this.onChanged();
                }
                else {
                    this.entityListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addEntityList(final int index, final SceneEntityInfoOuterClass.SceneEntityInfo value) {
                if (this.entityListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureEntityListIsMutable();
                    this.entityList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.entityListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addEntityList(final SceneEntityInfoOuterClass.SceneEntityInfo.Builder builderForValue) {
                if (this.entityListBuilder_ == null) {
                    this.ensureEntityListIsMutable();
                    this.entityList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.entityListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addEntityList(final int index, final SceneEntityInfoOuterClass.SceneEntityInfo.Builder builderForValue) {
                if (this.entityListBuilder_ == null) {
                    this.ensureEntityListIsMutable();
                    this.entityList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.entityListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllEntityList(final Iterable<? extends SceneEntityInfoOuterClass.SceneEntityInfo> values) {
                if (this.entityListBuilder_ == null) {
                    this.ensureEntityListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.entityList_);
                    this.onChanged();
                }
                else {
                    this.entityListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearEntityList() {
                if (this.entityListBuilder_ == null) {
                    this.entityList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.entityListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeEntityList(final int index) {
                if (this.entityListBuilder_ == null) {
                    this.ensureEntityListIsMutable();
                    this.entityList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.entityListBuilder_.remove(index);
                }
                return this;
            }
            
            public SceneEntityInfoOuterClass.SceneEntityInfo.Builder getEntityListBuilder(final int index) {
                return this.getEntityListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public SceneEntityInfoOuterClass.SceneEntityInfoOrBuilder getEntityListOrBuilder(final int index) {
                if (this.entityListBuilder_ == null) {
                    return this.entityList_.get(index);
                }
                return this.entityListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends SceneEntityInfoOuterClass.SceneEntityInfoOrBuilder> getEntityListOrBuilderList() {
                if (this.entityListBuilder_ != null) {
                    return this.entityListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends SceneEntityInfoOuterClass.SceneEntityInfoOrBuilder>)this.entityList_);
            }
            
            public SceneEntityInfoOuterClass.SceneEntityInfo.Builder addEntityListBuilder() {
                return this.getEntityListFieldBuilder().addBuilder(SceneEntityInfoOuterClass.SceneEntityInfo.getDefaultInstance());
            }
            
            public SceneEntityInfoOuterClass.SceneEntityInfo.Builder addEntityListBuilder(final int index) {
                return this.getEntityListFieldBuilder().addBuilder(index, SceneEntityInfoOuterClass.SceneEntityInfo.getDefaultInstance());
            }
            
            public List<SceneEntityInfoOuterClass.SceneEntityInfo.Builder> getEntityListBuilderList() {
                return this.getEntityListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<SceneEntityInfoOuterClass.SceneEntityInfo, SceneEntityInfoOuterClass.SceneEntityInfo.Builder, SceneEntityInfoOuterClass.SceneEntityInfoOrBuilder> getEntityListFieldBuilder() {
                if (this.entityListBuilder_ == null) {
                    this.entityListBuilder_ = new RepeatedFieldBuilderV3<SceneEntityInfoOuterClass.SceneEntityInfo, SceneEntityInfoOuterClass.SceneEntityInfo.Builder, SceneEntityInfoOuterClass.SceneEntityInfoOrBuilder>(this.entityList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.entityList_ = null;
                }
                return this.entityListBuilder_;
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
    
    public interface SceneEntityAppearNotifyOrBuilder extends MessageOrBuilder
    {
        int getAppearTypeValue();
        
        VisionTypeOuterClass.VisionType getAppearType();
        
        int getParam();
        
        List<SceneEntityInfoOuterClass.SceneEntityInfo> getEntityListList();
        
        SceneEntityInfoOuterClass.SceneEntityInfo getEntityList(final int p0);
        
        int getEntityListCount();
        
        List<? extends SceneEntityInfoOuterClass.SceneEntityInfoOrBuilder> getEntityListOrBuilderList();
        
        SceneEntityInfoOuterClass.SceneEntityInfoOrBuilder getEntityListOrBuilder(final int p0);
    }
}
