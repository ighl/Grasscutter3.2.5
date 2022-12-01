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

public final class Unk2700HFMDKDHCJCM
{
    private static final Descriptors.Descriptor internal_static_Unk2700_HFMDKDHCJCM_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_Unk2700_HFMDKDHCJCM_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private Unk2700HFMDKDHCJCM() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return Unk2700HFMDKDHCJCM.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0019Unk2700_HFMDKDHCJCM.proto\u001a\fVector.proto\";\n\u0013Unk2700_HFMDKDHCJCM\u0012$\n\u0013Unk2700_CMOMNFNGCGB\u0018\u0001 \u0001(\u000b2\u0007.VectorB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        Unk2700HFMDKDHCJCM.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { VectorOuterClass.getDescriptor() });
        internal_static_Unk2700_HFMDKDHCJCM_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_Unk2700_HFMDKDHCJCM_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(Unk2700HFMDKDHCJCM.internal_static_Unk2700_HFMDKDHCJCM_descriptor, new String[] { "Unk2700CMOMNFNGCGB" });
        VectorOuterClass.getDescriptor();
    }
    
    public static final class Unk2700_HFMDKDHCJCM extends GeneratedMessageV3 implements Unk2700_HFMDKDHCJCMOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int UNK2700_CMOMNFNGCGB_FIELD_NUMBER = 1;
        private VectorOuterClass.Vector unk2700CMOMNFNGCGB_;
        private byte memoizedIsInitialized;
        private static final Unk2700_HFMDKDHCJCM DEFAULT_INSTANCE;
        private static final Parser<Unk2700_HFMDKDHCJCM> PARSER;
        
        private Unk2700_HFMDKDHCJCM(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private Unk2700_HFMDKDHCJCM() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new Unk2700_HFMDKDHCJCM();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private Unk2700_HFMDKDHCJCM(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 10: {
                            VectorOuterClass.Vector.Builder subBuilder = null;
                            if (this.unk2700CMOMNFNGCGB_ != null) {
                                subBuilder = this.unk2700CMOMNFNGCGB_.toBuilder();
                            }
                            this.unk2700CMOMNFNGCGB_ = input.readMessage(VectorOuterClass.Vector.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.unk2700CMOMNFNGCGB_);
                                this.unk2700CMOMNFNGCGB_ = subBuilder.buildPartial();
                                continue;
                            }
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
            return Unk2700HFMDKDHCJCM.internal_static_Unk2700_HFMDKDHCJCM_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return Unk2700HFMDKDHCJCM.internal_static_Unk2700_HFMDKDHCJCM_fieldAccessorTable.ensureFieldAccessorsInitialized(Unk2700_HFMDKDHCJCM.class, Builder.class);
        }
        
        @Override
        public boolean hasUnk2700CMOMNFNGCGB() {
            return this.unk2700CMOMNFNGCGB_ != null;
        }
        
        @Override
        public VectorOuterClass.Vector getUnk2700CMOMNFNGCGB() {
            return (this.unk2700CMOMNFNGCGB_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.unk2700CMOMNFNGCGB_;
        }
        
        @Override
        public VectorOuterClass.VectorOrBuilder getUnk2700CMOMNFNGCGBOrBuilder() {
            return this.getUnk2700CMOMNFNGCGB();
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
            if (this.unk2700CMOMNFNGCGB_ != null) {
                output.writeMessage(1, this.getUnk2700CMOMNFNGCGB());
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
            if (this.unk2700CMOMNFNGCGB_ != null) {
                size += CodedOutputStream.computeMessageSize(1, this.getUnk2700CMOMNFNGCGB());
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Unk2700_HFMDKDHCJCM)) {
                return super.equals(obj);
            }
            final Unk2700_HFMDKDHCJCM other = (Unk2700_HFMDKDHCJCM)obj;
            return this.hasUnk2700CMOMNFNGCGB() == other.hasUnk2700CMOMNFNGCGB() && (!this.hasUnk2700CMOMNFNGCGB() || this.getUnk2700CMOMNFNGCGB().equals(other.getUnk2700CMOMNFNGCGB())) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasUnk2700CMOMNFNGCGB()) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getUnk2700CMOMNFNGCGB().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static Unk2700_HFMDKDHCJCM parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return Unk2700_HFMDKDHCJCM.PARSER.parseFrom(data);
        }
        
        public static Unk2700_HFMDKDHCJCM parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Unk2700_HFMDKDHCJCM.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Unk2700_HFMDKDHCJCM parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return Unk2700_HFMDKDHCJCM.PARSER.parseFrom(data);
        }
        
        public static Unk2700_HFMDKDHCJCM parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Unk2700_HFMDKDHCJCM.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Unk2700_HFMDKDHCJCM parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return Unk2700_HFMDKDHCJCM.PARSER.parseFrom(data);
        }
        
        public static Unk2700_HFMDKDHCJCM parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Unk2700_HFMDKDHCJCM.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Unk2700_HFMDKDHCJCM parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk2700_HFMDKDHCJCM.PARSER, input);
        }
        
        public static Unk2700_HFMDKDHCJCM parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk2700_HFMDKDHCJCM.PARSER, input, extensionRegistry);
        }
        
        public static Unk2700_HFMDKDHCJCM parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(Unk2700_HFMDKDHCJCM.PARSER, input);
        }
        
        public static Unk2700_HFMDKDHCJCM parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(Unk2700_HFMDKDHCJCM.PARSER, input, extensionRegistry);
        }
        
        public static Unk2700_HFMDKDHCJCM parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk2700_HFMDKDHCJCM.PARSER, input);
        }
        
        public static Unk2700_HFMDKDHCJCM parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk2700_HFMDKDHCJCM.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return Unk2700_HFMDKDHCJCM.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final Unk2700_HFMDKDHCJCM prototype) {
            return Unk2700_HFMDKDHCJCM.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == Unk2700_HFMDKDHCJCM.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static Unk2700_HFMDKDHCJCM getDefaultInstance() {
            return Unk2700_HFMDKDHCJCM.DEFAULT_INSTANCE;
        }
        
        public static Parser<Unk2700_HFMDKDHCJCM> parser() {
            return Unk2700_HFMDKDHCJCM.PARSER;
        }
        
        @Override
        public Parser<Unk2700_HFMDKDHCJCM> getParserForType() {
            return Unk2700_HFMDKDHCJCM.PARSER;
        }
        
        @Override
        public Unk2700_HFMDKDHCJCM getDefaultInstanceForType() {
            return Unk2700_HFMDKDHCJCM.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new Unk2700_HFMDKDHCJCM();
            PARSER = new AbstractParser<Unk2700_HFMDKDHCJCM>() {
                @Override
                public Unk2700_HFMDKDHCJCM parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new Unk2700_HFMDKDHCJCM(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements Unk2700_HFMDKDHCJCMOrBuilder
        {
            private VectorOuterClass.Vector unk2700CMOMNFNGCGB_;
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> unk2700CMOMNFNGCGBBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return Unk2700HFMDKDHCJCM.internal_static_Unk2700_HFMDKDHCJCM_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return Unk2700HFMDKDHCJCM.internal_static_Unk2700_HFMDKDHCJCM_fieldAccessorTable.ensureFieldAccessorsInitialized(Unk2700_HFMDKDHCJCM.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (Unk2700_HFMDKDHCJCM.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.unk2700CMOMNFNGCGBBuilder_ == null) {
                    this.unk2700CMOMNFNGCGB_ = null;
                }
                else {
                    this.unk2700CMOMNFNGCGB_ = null;
                    this.unk2700CMOMNFNGCGBBuilder_ = null;
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return Unk2700HFMDKDHCJCM.internal_static_Unk2700_HFMDKDHCJCM_descriptor;
            }
            
            @Override
            public Unk2700_HFMDKDHCJCM getDefaultInstanceForType() {
                return Unk2700_HFMDKDHCJCM.getDefaultInstance();
            }
            
            @Override
            public Unk2700_HFMDKDHCJCM build() {
                final Unk2700_HFMDKDHCJCM result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public Unk2700_HFMDKDHCJCM buildPartial() {
                final Unk2700_HFMDKDHCJCM result = new Unk2700_HFMDKDHCJCM(this);
                if (this.unk2700CMOMNFNGCGBBuilder_ == null) {
                    result.unk2700CMOMNFNGCGB_ = this.unk2700CMOMNFNGCGB_;
                }
                else {
                    result.unk2700CMOMNFNGCGB_ = this.unk2700CMOMNFNGCGBBuilder_.build();
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
                if (other instanceof Unk2700_HFMDKDHCJCM) {
                    return this.mergeFrom((Unk2700_HFMDKDHCJCM)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final Unk2700_HFMDKDHCJCM other) {
                if (other == Unk2700_HFMDKDHCJCM.getDefaultInstance()) {
                    return this;
                }
                if (other.hasUnk2700CMOMNFNGCGB()) {
                    this.mergeUnk2700CMOMNFNGCGB(other.getUnk2700CMOMNFNGCGB());
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
                Unk2700_HFMDKDHCJCM parsedMessage = null;
                try {
                    parsedMessage = Unk2700_HFMDKDHCJCM.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (Unk2700_HFMDKDHCJCM)e.getUnfinishedMessage();
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
            public boolean hasUnk2700CMOMNFNGCGB() {
                return this.unk2700CMOMNFNGCGBBuilder_ != null || this.unk2700CMOMNFNGCGB_ != null;
            }
            
            @Override
            public VectorOuterClass.Vector getUnk2700CMOMNFNGCGB() {
                if (this.unk2700CMOMNFNGCGBBuilder_ == null) {
                    return (this.unk2700CMOMNFNGCGB_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.unk2700CMOMNFNGCGB_;
                }
                return this.unk2700CMOMNFNGCGBBuilder_.getMessage();
            }
            
            public Builder setUnk2700CMOMNFNGCGB(final VectorOuterClass.Vector value) {
                if (this.unk2700CMOMNFNGCGBBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.unk2700CMOMNFNGCGB_ = value;
                    this.onChanged();
                }
                else {
                    this.unk2700CMOMNFNGCGBBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setUnk2700CMOMNFNGCGB(final VectorOuterClass.Vector.Builder builderForValue) {
                if (this.unk2700CMOMNFNGCGBBuilder_ == null) {
                    this.unk2700CMOMNFNGCGB_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.unk2700CMOMNFNGCGBBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeUnk2700CMOMNFNGCGB(final VectorOuterClass.Vector value) {
                if (this.unk2700CMOMNFNGCGBBuilder_ == null) {
                    if (this.unk2700CMOMNFNGCGB_ != null) {
                        this.unk2700CMOMNFNGCGB_ = VectorOuterClass.Vector.newBuilder(this.unk2700CMOMNFNGCGB_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.unk2700CMOMNFNGCGB_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.unk2700CMOMNFNGCGBBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearUnk2700CMOMNFNGCGB() {
                if (this.unk2700CMOMNFNGCGBBuilder_ == null) {
                    this.unk2700CMOMNFNGCGB_ = null;
                    this.onChanged();
                }
                else {
                    this.unk2700CMOMNFNGCGB_ = null;
                    this.unk2700CMOMNFNGCGBBuilder_ = null;
                }
                return this;
            }
            
            public VectorOuterClass.Vector.Builder getUnk2700CMOMNFNGCGBBuilder() {
                this.onChanged();
                return this.getUnk2700CMOMNFNGCGBFieldBuilder().getBuilder();
            }
            
            @Override
            public VectorOuterClass.VectorOrBuilder getUnk2700CMOMNFNGCGBOrBuilder() {
                if (this.unk2700CMOMNFNGCGBBuilder_ != null) {
                    return this.unk2700CMOMNFNGCGBBuilder_.getMessageOrBuilder();
                }
                return (this.unk2700CMOMNFNGCGB_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.unk2700CMOMNFNGCGB_;
            }
            
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> getUnk2700CMOMNFNGCGBFieldBuilder() {
                if (this.unk2700CMOMNFNGCGBBuilder_ == null) {
                    this.unk2700CMOMNFNGCGBBuilder_ = new SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder>(this.getUnk2700CMOMNFNGCGB(), this.getParentForChildren(), this.isClean());
                    this.unk2700CMOMNFNGCGB_ = null;
                }
                return this.unk2700CMOMNFNGCGBBuilder_;
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
    
    public interface Unk2700_HFMDKDHCJCMOrBuilder extends MessageOrBuilder
    {
        boolean hasUnk2700CMOMNFNGCGB();
        
        VectorOuterClass.Vector getUnk2700CMOMNFNGCGB();
        
        VectorOuterClass.VectorOrBuilder getUnk2700CMOMNFNGCGBOrBuilder();
    }
}
