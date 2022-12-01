// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
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

public final class AbilityGadgetInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_AbilityGadgetInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AbilityGadgetInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AbilityGadgetInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AbilityGadgetInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0017AbilityGadgetInfo.proto\"X\n\u0011AbilityGadgetInfo\u0012\u000f\n\u0007camp_id\u0018\u0001 \u0001(\r\u0012\u0018\n\u0010camp_target_type\u0018\u0002 \u0001(\r\u0012\u0018\n\u0010target_entity_id\u0018\u0003 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AbilityGadgetInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_AbilityGadgetInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AbilityGadgetInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AbilityGadgetInfoOuterClass.internal_static_AbilityGadgetInfo_descriptor, new String[] { "CampId", "CampTargetType", "TargetEntityId" });
    }
    
    public static final class AbilityGadgetInfo extends GeneratedMessageV3 implements AbilityGadgetInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int CAMP_ID_FIELD_NUMBER = 1;
        private int campId_;
        public static final int CAMP_TARGET_TYPE_FIELD_NUMBER = 2;
        private int campTargetType_;
        public static final int TARGET_ENTITY_ID_FIELD_NUMBER = 3;
        private int targetEntityId_;
        private byte memoizedIsInitialized;
        private static final AbilityGadgetInfo DEFAULT_INSTANCE;
        private static final Parser<AbilityGadgetInfo> PARSER;
        
        private AbilityGadgetInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private AbilityGadgetInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AbilityGadgetInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AbilityGadgetInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 8: {
                            this.campId_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.campTargetType_ = input.readUInt32();
                            continue;
                        }
                        case 24: {
                            this.targetEntityId_ = input.readUInt32();
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
            return AbilityGadgetInfoOuterClass.internal_static_AbilityGadgetInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AbilityGadgetInfoOuterClass.internal_static_AbilityGadgetInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(AbilityGadgetInfo.class, Builder.class);
        }
        
        @Override
        public int getCampId() {
            return this.campId_;
        }
        
        @Override
        public int getCampTargetType() {
            return this.campTargetType_;
        }
        
        @Override
        public int getTargetEntityId() {
            return this.targetEntityId_;
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
            if (this.campId_ != 0) {
                output.writeUInt32(1, this.campId_);
            }
            if (this.campTargetType_ != 0) {
                output.writeUInt32(2, this.campTargetType_);
            }
            if (this.targetEntityId_ != 0) {
                output.writeUInt32(3, this.targetEntityId_);
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
            if (this.campId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.campId_);
            }
            if (this.campTargetType_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.campTargetType_);
            }
            if (this.targetEntityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.targetEntityId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbilityGadgetInfo)) {
                return super.equals(obj);
            }
            final AbilityGadgetInfo other = (AbilityGadgetInfo)obj;
            return this.getCampId() == other.getCampId() && this.getCampTargetType() == other.getCampTargetType() && this.getTargetEntityId() == other.getTargetEntityId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getCampId();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getCampTargetType();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getTargetEntityId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AbilityGadgetInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AbilityGadgetInfo.PARSER.parseFrom(data);
        }
        
        public static AbilityGadgetInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityGadgetInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityGadgetInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AbilityGadgetInfo.PARSER.parseFrom(data);
        }
        
        public static AbilityGadgetInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityGadgetInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityGadgetInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AbilityGadgetInfo.PARSER.parseFrom(data);
        }
        
        public static AbilityGadgetInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityGadgetInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityGadgetInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityGadgetInfo.PARSER, input);
        }
        
        public static AbilityGadgetInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityGadgetInfo.PARSER, input, extensionRegistry);
        }
        
        public static AbilityGadgetInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AbilityGadgetInfo.PARSER, input);
        }
        
        public static AbilityGadgetInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AbilityGadgetInfo.PARSER, input, extensionRegistry);
        }
        
        public static AbilityGadgetInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityGadgetInfo.PARSER, input);
        }
        
        public static AbilityGadgetInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityGadgetInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AbilityGadgetInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AbilityGadgetInfo prototype) {
            return AbilityGadgetInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AbilityGadgetInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AbilityGadgetInfo getDefaultInstance() {
            return AbilityGadgetInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<AbilityGadgetInfo> parser() {
            return AbilityGadgetInfo.PARSER;
        }
        
        @Override
        public Parser<AbilityGadgetInfo> getParserForType() {
            return AbilityGadgetInfo.PARSER;
        }
        
        @Override
        public AbilityGadgetInfo getDefaultInstanceForType() {
            return AbilityGadgetInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AbilityGadgetInfo();
            PARSER = new AbstractParser<AbilityGadgetInfo>() {
                @Override
                public AbilityGadgetInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AbilityGadgetInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AbilityGadgetInfoOrBuilder
        {
            private int campId_;
            private int campTargetType_;
            private int targetEntityId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AbilityGadgetInfoOuterClass.internal_static_AbilityGadgetInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AbilityGadgetInfoOuterClass.internal_static_AbilityGadgetInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(AbilityGadgetInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AbilityGadgetInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.campId_ = 0;
                this.campTargetType_ = 0;
                this.targetEntityId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AbilityGadgetInfoOuterClass.internal_static_AbilityGadgetInfo_descriptor;
            }
            
            @Override
            public AbilityGadgetInfo getDefaultInstanceForType() {
                return AbilityGadgetInfo.getDefaultInstance();
            }
            
            @Override
            public AbilityGadgetInfo build() {
                final AbilityGadgetInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AbilityGadgetInfo buildPartial() {
                final AbilityGadgetInfo result = new AbilityGadgetInfo(this);
                result.campId_ = this.campId_;
                result.campTargetType_ = this.campTargetType_;
                result.targetEntityId_ = this.targetEntityId_;
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
                if (other instanceof AbilityGadgetInfo) {
                    return this.mergeFrom((AbilityGadgetInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AbilityGadgetInfo other) {
                if (other == AbilityGadgetInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getCampId() != 0) {
                    this.setCampId(other.getCampId());
                }
                if (other.getCampTargetType() != 0) {
                    this.setCampTargetType(other.getCampTargetType());
                }
                if (other.getTargetEntityId() != 0) {
                    this.setTargetEntityId(other.getTargetEntityId());
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
                AbilityGadgetInfo parsedMessage = null;
                try {
                    parsedMessage = AbilityGadgetInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AbilityGadgetInfo)e.getUnfinishedMessage();
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
            public int getCampId() {
                return this.campId_;
            }
            
            public Builder setCampId(final int value) {
                this.campId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCampId() {
                this.campId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getCampTargetType() {
                return this.campTargetType_;
            }
            
            public Builder setCampTargetType(final int value) {
                this.campTargetType_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCampTargetType() {
                this.campTargetType_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getTargetEntityId() {
                return this.targetEntityId_;
            }
            
            public Builder setTargetEntityId(final int value) {
                this.targetEntityId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTargetEntityId() {
                this.targetEntityId_ = 0;
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
    
    public interface AbilityGadgetInfoOrBuilder extends MessageOrBuilder
    {
        int getCampId();
        
        int getCampTargetType();
        
        int getTargetEntityId();
    }
}
