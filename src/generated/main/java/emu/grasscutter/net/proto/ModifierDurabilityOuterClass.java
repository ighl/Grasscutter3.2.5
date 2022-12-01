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

public final class ModifierDurabilityOuterClass
{
    private static final Descriptors.Descriptor internal_static_ModifierDurability_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ModifierDurability_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ModifierDurabilityOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ModifierDurabilityOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0018ModifierDurability.proto\"H\n\u0012ModifierDurability\u0012\u0014\n\freduce_ratio\u0018\u0001 \u0001(\u0002\u0012\u001c\n\u0014remaining_durability\u0018\u0002 \u0001(\u0002B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ModifierDurabilityOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_ModifierDurability_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ModifierDurability_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ModifierDurabilityOuterClass.internal_static_ModifierDurability_descriptor, new String[] { "ReduceRatio", "RemainingDurability" });
    }
    
    public static final class ModifierDurability extends GeneratedMessageV3 implements ModifierDurabilityOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int REDUCE_RATIO_FIELD_NUMBER = 1;
        private float reduceRatio_;
        public static final int REMAINING_DURABILITY_FIELD_NUMBER = 2;
        private float remainingDurability_;
        private byte memoizedIsInitialized;
        private static final ModifierDurability DEFAULT_INSTANCE;
        private static final Parser<ModifierDurability> PARSER;
        
        private ModifierDurability(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private ModifierDurability() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ModifierDurability();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ModifierDurability(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 13: {
                            this.reduceRatio_ = input.readFloat();
                            continue;
                        }
                        case 21: {
                            this.remainingDurability_ = input.readFloat();
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
            return ModifierDurabilityOuterClass.internal_static_ModifierDurability_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ModifierDurabilityOuterClass.internal_static_ModifierDurability_fieldAccessorTable.ensureFieldAccessorsInitialized(ModifierDurability.class, Builder.class);
        }
        
        @Override
        public float getReduceRatio() {
            return this.reduceRatio_;
        }
        
        @Override
        public float getRemainingDurability() {
            return this.remainingDurability_;
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
            if (this.reduceRatio_ != 0.0f) {
                output.writeFloat(1, this.reduceRatio_);
            }
            if (this.remainingDurability_ != 0.0f) {
                output.writeFloat(2, this.remainingDurability_);
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
            if (this.reduceRatio_ != 0.0f) {
                size += CodedOutputStream.computeFloatSize(1, this.reduceRatio_);
            }
            if (this.remainingDurability_ != 0.0f) {
                size += CodedOutputStream.computeFloatSize(2, this.remainingDurability_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ModifierDurability)) {
                return super.equals(obj);
            }
            final ModifierDurability other = (ModifierDurability)obj;
            return Float.floatToIntBits(this.getReduceRatio()) == Float.floatToIntBits(other.getReduceRatio()) && Float.floatToIntBits(this.getRemainingDurability()) == Float.floatToIntBits(other.getRemainingDurability()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + Float.floatToIntBits(this.getReduceRatio());
            hash = 37 * hash + 2;
            hash = 53 * hash + Float.floatToIntBits(this.getRemainingDurability());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ModifierDurability parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ModifierDurability.PARSER.parseFrom(data);
        }
        
        public static ModifierDurability parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ModifierDurability.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ModifierDurability parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ModifierDurability.PARSER.parseFrom(data);
        }
        
        public static ModifierDurability parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ModifierDurability.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ModifierDurability parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ModifierDurability.PARSER.parseFrom(data);
        }
        
        public static ModifierDurability parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ModifierDurability.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ModifierDurability parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ModifierDurability.PARSER, input);
        }
        
        public static ModifierDurability parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ModifierDurability.PARSER, input, extensionRegistry);
        }
        
        public static ModifierDurability parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ModifierDurability.PARSER, input);
        }
        
        public static ModifierDurability parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ModifierDurability.PARSER, input, extensionRegistry);
        }
        
        public static ModifierDurability parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ModifierDurability.PARSER, input);
        }
        
        public static ModifierDurability parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ModifierDurability.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ModifierDurability.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ModifierDurability prototype) {
            return ModifierDurability.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ModifierDurability.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ModifierDurability getDefaultInstance() {
            return ModifierDurability.DEFAULT_INSTANCE;
        }
        
        public static Parser<ModifierDurability> parser() {
            return ModifierDurability.PARSER;
        }
        
        @Override
        public Parser<ModifierDurability> getParserForType() {
            return ModifierDurability.PARSER;
        }
        
        @Override
        public ModifierDurability getDefaultInstanceForType() {
            return ModifierDurability.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ModifierDurability();
            PARSER = new AbstractParser<ModifierDurability>() {
                @Override
                public ModifierDurability parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ModifierDurability(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ModifierDurabilityOrBuilder
        {
            private float reduceRatio_;
            private float remainingDurability_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ModifierDurabilityOuterClass.internal_static_ModifierDurability_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ModifierDurabilityOuterClass.internal_static_ModifierDurability_fieldAccessorTable.ensureFieldAccessorsInitialized(ModifierDurability.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ModifierDurability.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.reduceRatio_ = 0.0f;
                this.remainingDurability_ = 0.0f;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ModifierDurabilityOuterClass.internal_static_ModifierDurability_descriptor;
            }
            
            @Override
            public ModifierDurability getDefaultInstanceForType() {
                return ModifierDurability.getDefaultInstance();
            }
            
            @Override
            public ModifierDurability build() {
                final ModifierDurability result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ModifierDurability buildPartial() {
                final ModifierDurability result = new ModifierDurability(this);
                result.reduceRatio_ = this.reduceRatio_;
                result.remainingDurability_ = this.remainingDurability_;
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
                if (other instanceof ModifierDurability) {
                    return this.mergeFrom((ModifierDurability)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ModifierDurability other) {
                if (other == ModifierDurability.getDefaultInstance()) {
                    return this;
                }
                if (other.getReduceRatio() != 0.0f) {
                    this.setReduceRatio(other.getReduceRatio());
                }
                if (other.getRemainingDurability() != 0.0f) {
                    this.setRemainingDurability(other.getRemainingDurability());
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
                ModifierDurability parsedMessage = null;
                try {
                    parsedMessage = ModifierDurability.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ModifierDurability)e.getUnfinishedMessage();
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
            public float getReduceRatio() {
                return this.reduceRatio_;
            }
            
            public Builder setReduceRatio(final float value) {
                this.reduceRatio_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearReduceRatio() {
                this.reduceRatio_ = 0.0f;
                this.onChanged();
                return this;
            }
            
            @Override
            public float getRemainingDurability() {
                return this.remainingDurability_;
            }
            
            public Builder setRemainingDurability(final float value) {
                this.remainingDurability_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRemainingDurability() {
                this.remainingDurability_ = 0.0f;
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
    
    public interface ModifierDurabilityOrBuilder extends MessageOrBuilder
    {
        float getReduceRatio();
        
        float getRemainingDurability();
    }
}
