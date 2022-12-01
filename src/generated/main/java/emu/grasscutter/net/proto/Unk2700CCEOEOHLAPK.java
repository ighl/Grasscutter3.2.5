// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.Internal;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class Unk2700CCEOEOHLAPK
{
    private static final Descriptors.Descriptor internal_static_Unk2700_CCEOEOHLAPK_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_Unk2700_CCEOEOHLAPK_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private Unk2700CCEOEOHLAPK() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return Unk2700CCEOEOHLAPK.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0019Unk2700_CCEOEOHLAPK.proto\u001a\fVector.proto\"s\n\u0013Unk2700_CCEOEOHLAPK\u0012\u0015\n\ris_hint_valid\u0018\u0003 \u0001(\b\u0012 \n\u000fhint_center_pos\u0018\b \u0001(\u000b2\u0007.Vector\u0012\u0010\n\bgroup_id\u0018\u0006 \u0001(\r\u0012\u0011\n\tconfig_id\u0018\t \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        Unk2700CCEOEOHLAPK.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { VectorOuterClass.getDescriptor() });
        internal_static_Unk2700_CCEOEOHLAPK_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_Unk2700_CCEOEOHLAPK_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(Unk2700CCEOEOHLAPK.internal_static_Unk2700_CCEOEOHLAPK_descriptor, new String[] { "IsHintValid", "HintCenterPos", "GroupId", "ConfigId" });
        VectorOuterClass.getDescriptor();
    }
    
    public static final class Unk2700_CCEOEOHLAPK extends GeneratedMessageV3 implements Unk2700_CCEOEOHLAPKOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int IS_HINT_VALID_FIELD_NUMBER = 3;
        private boolean isHintValid_;
        public static final int HINT_CENTER_POS_FIELD_NUMBER = 8;
        private VectorOuterClass.Vector hintCenterPos_;
        public static final int GROUP_ID_FIELD_NUMBER = 6;
        private int groupId_;
        public static final int CONFIG_ID_FIELD_NUMBER = 9;
        private int configId_;
        private byte memoizedIsInitialized;
        private static final Unk2700_CCEOEOHLAPK DEFAULT_INSTANCE;
        private static final Parser<Unk2700_CCEOEOHLAPK> PARSER;
        
        private Unk2700_CCEOEOHLAPK(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private Unk2700_CCEOEOHLAPK() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new Unk2700_CCEOEOHLAPK();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private Unk2700_CCEOEOHLAPK(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
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
                        case 24: {
                            this.isHintValid_ = input.readBool();
                            continue;
                        }
                        case 48: {
                            this.groupId_ = input.readUInt32();
                            continue;
                        }
                        case 66: {
                            VectorOuterClass.Vector.Builder subBuilder = null;
                            if (this.hintCenterPos_ != null) {
                                subBuilder = this.hintCenterPos_.toBuilder();
                            }
                            this.hintCenterPos_ = input.readMessage(VectorOuterClass.Vector.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.hintCenterPos_);
                                this.hintCenterPos_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 72: {
                            this.configId_ = input.readUInt32();
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
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return Unk2700CCEOEOHLAPK.internal_static_Unk2700_CCEOEOHLAPK_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return Unk2700CCEOEOHLAPK.internal_static_Unk2700_CCEOEOHLAPK_fieldAccessorTable.ensureFieldAccessorsInitialized(Unk2700_CCEOEOHLAPK.class, Builder.class);
        }
        
        @Override
        public boolean getIsHintValid() {
            return this.isHintValid_;
        }
        
        @Override
        public boolean hasHintCenterPos() {
            return this.hintCenterPos_ != null;
        }
        
        @Override
        public VectorOuterClass.Vector getHintCenterPos() {
            return (this.hintCenterPos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.hintCenterPos_;
        }
        
        @Override
        public VectorOuterClass.VectorOrBuilder getHintCenterPosOrBuilder() {
            return this.getHintCenterPos();
        }
        
        @Override
        public int getGroupId() {
            return this.groupId_;
        }
        
        @Override
        public int getConfigId() {
            return this.configId_;
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
            if (this.isHintValid_) {
                output.writeBool(3, this.isHintValid_);
            }
            if (this.groupId_ != 0) {
                output.writeUInt32(6, this.groupId_);
            }
            if (this.hintCenterPos_ != null) {
                output.writeMessage(8, this.getHintCenterPos());
            }
            if (this.configId_ != 0) {
                output.writeUInt32(9, this.configId_);
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
            if (this.isHintValid_) {
                size += CodedOutputStream.computeBoolSize(3, this.isHintValid_);
            }
            if (this.groupId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.groupId_);
            }
            if (this.hintCenterPos_ != null) {
                size += CodedOutputStream.computeMessageSize(8, this.getHintCenterPos());
            }
            if (this.configId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.configId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Unk2700_CCEOEOHLAPK)) {
                return super.equals(obj);
            }
            final Unk2700_CCEOEOHLAPK other = (Unk2700_CCEOEOHLAPK)obj;
            return this.getIsHintValid() == other.getIsHintValid() && this.hasHintCenterPos() == other.hasHintCenterPos() && (!this.hasHintCenterPos() || this.getHintCenterPos().equals(other.getHintCenterPos())) && this.getGroupId() == other.getGroupId() && this.getConfigId() == other.getConfigId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 3;
            hash = 53 * hash + Internal.hashBoolean(this.getIsHintValid());
            if (this.hasHintCenterPos()) {
                hash = 37 * hash + 8;
                hash = 53 * hash + this.getHintCenterPos().hashCode();
            }
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getGroupId();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getConfigId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static Unk2700_CCEOEOHLAPK parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return Unk2700_CCEOEOHLAPK.PARSER.parseFrom(data);
        }
        
        public static Unk2700_CCEOEOHLAPK parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Unk2700_CCEOEOHLAPK.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Unk2700_CCEOEOHLAPK parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return Unk2700_CCEOEOHLAPK.PARSER.parseFrom(data);
        }
        
        public static Unk2700_CCEOEOHLAPK parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Unk2700_CCEOEOHLAPK.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Unk2700_CCEOEOHLAPK parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return Unk2700_CCEOEOHLAPK.PARSER.parseFrom(data);
        }
        
        public static Unk2700_CCEOEOHLAPK parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Unk2700_CCEOEOHLAPK.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Unk2700_CCEOEOHLAPK parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk2700_CCEOEOHLAPK.PARSER, input);
        }
        
        public static Unk2700_CCEOEOHLAPK parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk2700_CCEOEOHLAPK.PARSER, input, extensionRegistry);
        }
        
        public static Unk2700_CCEOEOHLAPK parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(Unk2700_CCEOEOHLAPK.PARSER, input);
        }
        
        public static Unk2700_CCEOEOHLAPK parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(Unk2700_CCEOEOHLAPK.PARSER, input, extensionRegistry);
        }
        
        public static Unk2700_CCEOEOHLAPK parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk2700_CCEOEOHLAPK.PARSER, input);
        }
        
        public static Unk2700_CCEOEOHLAPK parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk2700_CCEOEOHLAPK.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return Unk2700_CCEOEOHLAPK.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final Unk2700_CCEOEOHLAPK prototype) {
            return Unk2700_CCEOEOHLAPK.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == Unk2700_CCEOEOHLAPK.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static Unk2700_CCEOEOHLAPK getDefaultInstance() {
            return Unk2700_CCEOEOHLAPK.DEFAULT_INSTANCE;
        }
        
        public static Parser<Unk2700_CCEOEOHLAPK> parser() {
            return Unk2700_CCEOEOHLAPK.PARSER;
        }
        
        @Override
        public Parser<Unk2700_CCEOEOHLAPK> getParserForType() {
            return Unk2700_CCEOEOHLAPK.PARSER;
        }
        
        @Override
        public Unk2700_CCEOEOHLAPK getDefaultInstanceForType() {
            return Unk2700_CCEOEOHLAPK.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new Unk2700_CCEOEOHLAPK();
            PARSER = new AbstractParser<Unk2700_CCEOEOHLAPK>() {
                @Override
                public Unk2700_CCEOEOHLAPK parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new Unk2700_CCEOEOHLAPK(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements Unk2700_CCEOEOHLAPKOrBuilder
        {
            private boolean isHintValid_;
            private VectorOuterClass.Vector hintCenterPos_;
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> hintCenterPosBuilder_;
            private int groupId_;
            private int configId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return Unk2700CCEOEOHLAPK.internal_static_Unk2700_CCEOEOHLAPK_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return Unk2700CCEOEOHLAPK.internal_static_Unk2700_CCEOEOHLAPK_fieldAccessorTable.ensureFieldAccessorsInitialized(Unk2700_CCEOEOHLAPK.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (Unk2700_CCEOEOHLAPK.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.isHintValid_ = false;
                if (this.hintCenterPosBuilder_ == null) {
                    this.hintCenterPos_ = null;
                }
                else {
                    this.hintCenterPos_ = null;
                    this.hintCenterPosBuilder_ = null;
                }
                this.groupId_ = 0;
                this.configId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return Unk2700CCEOEOHLAPK.internal_static_Unk2700_CCEOEOHLAPK_descriptor;
            }
            
            @Override
            public Unk2700_CCEOEOHLAPK getDefaultInstanceForType() {
                return Unk2700_CCEOEOHLAPK.getDefaultInstance();
            }
            
            @Override
            public Unk2700_CCEOEOHLAPK build() {
                final Unk2700_CCEOEOHLAPK result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public Unk2700_CCEOEOHLAPK buildPartial() {
                final Unk2700_CCEOEOHLAPK result = new Unk2700_CCEOEOHLAPK(this);
                result.isHintValid_ = this.isHintValid_;
                if (this.hintCenterPosBuilder_ == null) {
                    result.hintCenterPos_ = this.hintCenterPos_;
                }
                else {
                    result.hintCenterPos_ = this.hintCenterPosBuilder_.build();
                }
                result.groupId_ = this.groupId_;
                result.configId_ = this.configId_;
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
                if (other instanceof Unk2700_CCEOEOHLAPK) {
                    return this.mergeFrom((Unk2700_CCEOEOHLAPK)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final Unk2700_CCEOEOHLAPK other) {
                if (other == Unk2700_CCEOEOHLAPK.getDefaultInstance()) {
                    return this;
                }
                if (other.getIsHintValid()) {
                    this.setIsHintValid(other.getIsHintValid());
                }
                if (other.hasHintCenterPos()) {
                    this.mergeHintCenterPos(other.getHintCenterPos());
                }
                if (other.getGroupId() != 0) {
                    this.setGroupId(other.getGroupId());
                }
                if (other.getConfigId() != 0) {
                    this.setConfigId(other.getConfigId());
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
                Unk2700_CCEOEOHLAPK parsedMessage = null;
                try {
                    parsedMessage = Unk2700_CCEOEOHLAPK.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (Unk2700_CCEOEOHLAPK)e.getUnfinishedMessage();
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
            public boolean getIsHintValid() {
                return this.isHintValid_;
            }
            
            public Builder setIsHintValid(final boolean value) {
                this.isHintValid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsHintValid() {
                this.isHintValid_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasHintCenterPos() {
                return this.hintCenterPosBuilder_ != null || this.hintCenterPos_ != null;
            }
            
            @Override
            public VectorOuterClass.Vector getHintCenterPos() {
                if (this.hintCenterPosBuilder_ == null) {
                    return (this.hintCenterPos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.hintCenterPos_;
                }
                return this.hintCenterPosBuilder_.getMessage();
            }
            
            public Builder setHintCenterPos(final VectorOuterClass.Vector value) {
                if (this.hintCenterPosBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.hintCenterPos_ = value;
                    this.onChanged();
                }
                else {
                    this.hintCenterPosBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setHintCenterPos(final VectorOuterClass.Vector.Builder builderForValue) {
                if (this.hintCenterPosBuilder_ == null) {
                    this.hintCenterPos_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.hintCenterPosBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeHintCenterPos(final VectorOuterClass.Vector value) {
                if (this.hintCenterPosBuilder_ == null) {
                    if (this.hintCenterPos_ != null) {
                        this.hintCenterPos_ = VectorOuterClass.Vector.newBuilder(this.hintCenterPos_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.hintCenterPos_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.hintCenterPosBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearHintCenterPos() {
                if (this.hintCenterPosBuilder_ == null) {
                    this.hintCenterPos_ = null;
                    this.onChanged();
                }
                else {
                    this.hintCenterPos_ = null;
                    this.hintCenterPosBuilder_ = null;
                }
                return this;
            }
            
            public VectorOuterClass.Vector.Builder getHintCenterPosBuilder() {
                this.onChanged();
                return this.getHintCenterPosFieldBuilder().getBuilder();
            }
            
            @Override
            public VectorOuterClass.VectorOrBuilder getHintCenterPosOrBuilder() {
                if (this.hintCenterPosBuilder_ != null) {
                    return this.hintCenterPosBuilder_.getMessageOrBuilder();
                }
                return (this.hintCenterPos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.hintCenterPos_;
            }
            
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> getHintCenterPosFieldBuilder() {
                if (this.hintCenterPosBuilder_ == null) {
                    this.hintCenterPosBuilder_ = new SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder>(this.getHintCenterPos(), this.getParentForChildren(), this.isClean());
                    this.hintCenterPos_ = null;
                }
                return this.hintCenterPosBuilder_;
            }
            
            @Override
            public int getGroupId() {
                return this.groupId_;
            }
            
            public Builder setGroupId(final int value) {
                this.groupId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearGroupId() {
                this.groupId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getConfigId() {
                return this.configId_;
            }
            
            public Builder setConfigId(final int value) {
                this.configId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearConfigId() {
                this.configId_ = 0;
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
    
    public interface Unk2700_CCEOEOHLAPKOrBuilder extends MessageOrBuilder
    {
        boolean getIsHintValid();
        
        boolean hasHintCenterPos();
        
        VectorOuterClass.Vector getHintCenterPos();
        
        VectorOuterClass.VectorOrBuilder getHintCenterPosOrBuilder();
        
        int getGroupId();
        
        int getConfigId();
    }
}
