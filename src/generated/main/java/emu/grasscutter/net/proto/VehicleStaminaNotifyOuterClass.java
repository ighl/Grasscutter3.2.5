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

public final class VehicleStaminaNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_VehicleStaminaNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_VehicleStaminaNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private VehicleStaminaNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return VehicleStaminaNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001aVehicleStaminaNotify.proto\">\n\u0014VehicleStaminaNotify\u0012\u0011\n\tentity_id\u0018\u0006 \u0001(\r\u0012\u0013\n\u000bcur_stamina\u0018\u000e \u0001(\u0002B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        VehicleStaminaNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_VehicleStaminaNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_VehicleStaminaNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(VehicleStaminaNotifyOuterClass.internal_static_VehicleStaminaNotify_descriptor, new String[] { "EntityId", "CurStamina" });
    }
    
    public static final class VehicleStaminaNotify extends GeneratedMessageV3 implements VehicleStaminaNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ENTITY_ID_FIELD_NUMBER = 6;
        private int entityId_;
        public static final int CUR_STAMINA_FIELD_NUMBER = 14;
        private float curStamina_;
        private byte memoizedIsInitialized;
        private static final VehicleStaminaNotify DEFAULT_INSTANCE;
        private static final Parser<VehicleStaminaNotify> PARSER;
        
        private VehicleStaminaNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private VehicleStaminaNotify() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new VehicleStaminaNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private VehicleStaminaNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 48: {
                            this.entityId_ = input.readUInt32();
                            continue;
                        }
                        case 117: {
                            this.curStamina_ = input.readFloat();
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
            return VehicleStaminaNotifyOuterClass.internal_static_VehicleStaminaNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return VehicleStaminaNotifyOuterClass.internal_static_VehicleStaminaNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(VehicleStaminaNotify.class, Builder.class);
        }
        
        @Override
        public int getEntityId() {
            return this.entityId_;
        }
        
        @Override
        public float getCurStamina() {
            return this.curStamina_;
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
            if (this.entityId_ != 0) {
                output.writeUInt32(6, this.entityId_);
            }
            if (this.curStamina_ != 0.0f) {
                output.writeFloat(14, this.curStamina_);
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
            if (this.entityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.entityId_);
            }
            if (this.curStamina_ != 0.0f) {
                size += CodedOutputStream.computeFloatSize(14, this.curStamina_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof VehicleStaminaNotify)) {
                return super.equals(obj);
            }
            final VehicleStaminaNotify other = (VehicleStaminaNotify)obj;
            return this.getEntityId() == other.getEntityId() && Float.floatToIntBits(this.getCurStamina()) == Float.floatToIntBits(other.getCurStamina()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getEntityId();
            hash = 37 * hash + 14;
            hash = 53 * hash + Float.floatToIntBits(this.getCurStamina());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static VehicleStaminaNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return VehicleStaminaNotify.PARSER.parseFrom(data);
        }
        
        public static VehicleStaminaNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return VehicleStaminaNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static VehicleStaminaNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return VehicleStaminaNotify.PARSER.parseFrom(data);
        }
        
        public static VehicleStaminaNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return VehicleStaminaNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static VehicleStaminaNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return VehicleStaminaNotify.PARSER.parseFrom(data);
        }
        
        public static VehicleStaminaNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return VehicleStaminaNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static VehicleStaminaNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(VehicleStaminaNotify.PARSER, input);
        }
        
        public static VehicleStaminaNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(VehicleStaminaNotify.PARSER, input, extensionRegistry);
        }
        
        public static VehicleStaminaNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(VehicleStaminaNotify.PARSER, input);
        }
        
        public static VehicleStaminaNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(VehicleStaminaNotify.PARSER, input, extensionRegistry);
        }
        
        public static VehicleStaminaNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(VehicleStaminaNotify.PARSER, input);
        }
        
        public static VehicleStaminaNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(VehicleStaminaNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return VehicleStaminaNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final VehicleStaminaNotify prototype) {
            return VehicleStaminaNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == VehicleStaminaNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static VehicleStaminaNotify getDefaultInstance() {
            return VehicleStaminaNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<VehicleStaminaNotify> parser() {
            return VehicleStaminaNotify.PARSER;
        }
        
        @Override
        public Parser<VehicleStaminaNotify> getParserForType() {
            return VehicleStaminaNotify.PARSER;
        }
        
        @Override
        public VehicleStaminaNotify getDefaultInstanceForType() {
            return VehicleStaminaNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new VehicleStaminaNotify();
            PARSER = new AbstractParser<VehicleStaminaNotify>() {
                @Override
                public VehicleStaminaNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new VehicleStaminaNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements VehicleStaminaNotifyOrBuilder
        {
            private int entityId_;
            private float curStamina_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return VehicleStaminaNotifyOuterClass.internal_static_VehicleStaminaNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return VehicleStaminaNotifyOuterClass.internal_static_VehicleStaminaNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(VehicleStaminaNotify.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (VehicleStaminaNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.entityId_ = 0;
                this.curStamina_ = 0.0f;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return VehicleStaminaNotifyOuterClass.internal_static_VehicleStaminaNotify_descriptor;
            }
            
            @Override
            public VehicleStaminaNotify getDefaultInstanceForType() {
                return VehicleStaminaNotify.getDefaultInstance();
            }
            
            @Override
            public VehicleStaminaNotify build() {
                final VehicleStaminaNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public VehicleStaminaNotify buildPartial() {
                final VehicleStaminaNotify result = new VehicleStaminaNotify(this);
                result.entityId_ = this.entityId_;
                result.curStamina_ = this.curStamina_;
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
                if (other instanceof VehicleStaminaNotify) {
                    return this.mergeFrom((VehicleStaminaNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final VehicleStaminaNotify other) {
                if (other == VehicleStaminaNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getEntityId() != 0) {
                    this.setEntityId(other.getEntityId());
                }
                if (other.getCurStamina() != 0.0f) {
                    this.setCurStamina(other.getCurStamina());
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
                VehicleStaminaNotify parsedMessage = null;
                try {
                    parsedMessage = VehicleStaminaNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (VehicleStaminaNotify)e.getUnfinishedMessage();
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
            public int getEntityId() {
                return this.entityId_;
            }
            
            public Builder setEntityId(final int value) {
                this.entityId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearEntityId() {
                this.entityId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public float getCurStamina() {
                return this.curStamina_;
            }
            
            public Builder setCurStamina(final float value) {
                this.curStamina_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCurStamina() {
                this.curStamina_ = 0.0f;
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
    
    public interface VehicleStaminaNotifyOrBuilder extends MessageOrBuilder
    {
        int getEntityId();
        
        float getCurStamina();
    }
}
