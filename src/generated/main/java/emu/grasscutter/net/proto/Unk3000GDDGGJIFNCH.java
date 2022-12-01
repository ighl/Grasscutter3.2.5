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

public final class Unk3000GDDGGJIFNCH
{
    private static final Descriptors.Descriptor internal_static_Unk3000_GDDGGJIFNCH_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_Unk3000_GDDGGJIFNCH_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private Unk3000GDDGGJIFNCH() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return Unk3000GDDGGJIFNCH.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0019Unk3000_GDDGGJIFNCH.proto\"¦\u0001\n\u0013Unk3000_GDDGGJIFNCH\u0012\u001b\n\u0013Unk3000_CFDMLGKNLKL\u0018\b \u0001(\r\u0012\u001b\n\u0013Unk3000_HONINDEHLNO\u0018\u000f \u0001(\b\u0012\u001b\n\u0013Unk3000_FIMENALCAKG\u0018\n \u0001(\b\u0012\u001b\n\u0013Unk3000_BJGNKDEGLGC\u0018\u0006 \u0001(\b\u0012\u001b\n\u0013Unk3000_HPHLGFDHBON\u0018\u0005 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        Unk3000GDDGGJIFNCH.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_Unk3000_GDDGGJIFNCH_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_Unk3000_GDDGGJIFNCH_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(Unk3000GDDGGJIFNCH.internal_static_Unk3000_GDDGGJIFNCH_descriptor, new String[] { "Unk3000CFDMLGKNLKL", "Unk3000HONINDEHLNO", "Unk3000FIMENALCAKG", "Unk3000BJGNKDEGLGC", "Unk3000HPHLGFDHBON" });
    }
    
    public static final class Unk3000_GDDGGJIFNCH extends GeneratedMessageV3 implements Unk3000_GDDGGJIFNCHOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int UNK3000_CFDMLGKNLKL_FIELD_NUMBER = 8;
        private int unk3000CFDMLGKNLKL_;
        public static final int UNK3000_HONINDEHLNO_FIELD_NUMBER = 15;
        private boolean unk3000HONINDEHLNO_;
        public static final int UNK3000_FIMENALCAKG_FIELD_NUMBER = 10;
        private boolean unk3000FIMENALCAKG_;
        public static final int UNK3000_BJGNKDEGLGC_FIELD_NUMBER = 6;
        private boolean unk3000BJGNKDEGLGC_;
        public static final int UNK3000_HPHLGFDHBON_FIELD_NUMBER = 5;
        private int unk3000HPHLGFDHBON_;
        private byte memoizedIsInitialized;
        private static final Unk3000_GDDGGJIFNCH DEFAULT_INSTANCE;
        private static final Parser<Unk3000_GDDGGJIFNCH> PARSER;
        
        private Unk3000_GDDGGJIFNCH(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private Unk3000_GDDGGJIFNCH() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new Unk3000_GDDGGJIFNCH();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private Unk3000_GDDGGJIFNCH(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 40: {
                            this.unk3000HPHLGFDHBON_ = input.readUInt32();
                            continue;
                        }
                        case 48: {
                            this.unk3000BJGNKDEGLGC_ = input.readBool();
                            continue;
                        }
                        case 64: {
                            this.unk3000CFDMLGKNLKL_ = input.readUInt32();
                            continue;
                        }
                        case 80: {
                            this.unk3000FIMENALCAKG_ = input.readBool();
                            continue;
                        }
                        case 120: {
                            this.unk3000HONINDEHLNO_ = input.readBool();
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
            return Unk3000GDDGGJIFNCH.internal_static_Unk3000_GDDGGJIFNCH_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return Unk3000GDDGGJIFNCH.internal_static_Unk3000_GDDGGJIFNCH_fieldAccessorTable.ensureFieldAccessorsInitialized(Unk3000_GDDGGJIFNCH.class, Builder.class);
        }
        
        @Override
        public int getUnk3000CFDMLGKNLKL() {
            return this.unk3000CFDMLGKNLKL_;
        }
        
        @Override
        public boolean getUnk3000HONINDEHLNO() {
            return this.unk3000HONINDEHLNO_;
        }
        
        @Override
        public boolean getUnk3000FIMENALCAKG() {
            return this.unk3000FIMENALCAKG_;
        }
        
        @Override
        public boolean getUnk3000BJGNKDEGLGC() {
            return this.unk3000BJGNKDEGLGC_;
        }
        
        @Override
        public int getUnk3000HPHLGFDHBON() {
            return this.unk3000HPHLGFDHBON_;
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
            if (this.unk3000HPHLGFDHBON_ != 0) {
                output.writeUInt32(5, this.unk3000HPHLGFDHBON_);
            }
            if (this.unk3000BJGNKDEGLGC_) {
                output.writeBool(6, this.unk3000BJGNKDEGLGC_);
            }
            if (this.unk3000CFDMLGKNLKL_ != 0) {
                output.writeUInt32(8, this.unk3000CFDMLGKNLKL_);
            }
            if (this.unk3000FIMENALCAKG_) {
                output.writeBool(10, this.unk3000FIMENALCAKG_);
            }
            if (this.unk3000HONINDEHLNO_) {
                output.writeBool(15, this.unk3000HONINDEHLNO_);
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
            if (this.unk3000HPHLGFDHBON_ != 0) {
                size += CodedOutputStream.computeUInt32Size(5, this.unk3000HPHLGFDHBON_);
            }
            if (this.unk3000BJGNKDEGLGC_) {
                size += CodedOutputStream.computeBoolSize(6, this.unk3000BJGNKDEGLGC_);
            }
            if (this.unk3000CFDMLGKNLKL_ != 0) {
                size += CodedOutputStream.computeUInt32Size(8, this.unk3000CFDMLGKNLKL_);
            }
            if (this.unk3000FIMENALCAKG_) {
                size += CodedOutputStream.computeBoolSize(10, this.unk3000FIMENALCAKG_);
            }
            if (this.unk3000HONINDEHLNO_) {
                size += CodedOutputStream.computeBoolSize(15, this.unk3000HONINDEHLNO_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Unk3000_GDDGGJIFNCH)) {
                return super.equals(obj);
            }
            final Unk3000_GDDGGJIFNCH other = (Unk3000_GDDGGJIFNCH)obj;
            return this.getUnk3000CFDMLGKNLKL() == other.getUnk3000CFDMLGKNLKL() && this.getUnk3000HONINDEHLNO() == other.getUnk3000HONINDEHLNO() && this.getUnk3000FIMENALCAKG() == other.getUnk3000FIMENALCAKG() && this.getUnk3000BJGNKDEGLGC() == other.getUnk3000BJGNKDEGLGC() && this.getUnk3000HPHLGFDHBON() == other.getUnk3000HPHLGFDHBON() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getUnk3000CFDMLGKNLKL();
            hash = 37 * hash + 15;
            hash = 53 * hash + Internal.hashBoolean(this.getUnk3000HONINDEHLNO());
            hash = 37 * hash + 10;
            hash = 53 * hash + Internal.hashBoolean(this.getUnk3000FIMENALCAKG());
            hash = 37 * hash + 6;
            hash = 53 * hash + Internal.hashBoolean(this.getUnk3000BJGNKDEGLGC());
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getUnk3000HPHLGFDHBON();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static Unk3000_GDDGGJIFNCH parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return Unk3000_GDDGGJIFNCH.PARSER.parseFrom(data);
        }
        
        public static Unk3000_GDDGGJIFNCH parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Unk3000_GDDGGJIFNCH.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Unk3000_GDDGGJIFNCH parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return Unk3000_GDDGGJIFNCH.PARSER.parseFrom(data);
        }
        
        public static Unk3000_GDDGGJIFNCH parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Unk3000_GDDGGJIFNCH.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Unk3000_GDDGGJIFNCH parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return Unk3000_GDDGGJIFNCH.PARSER.parseFrom(data);
        }
        
        public static Unk3000_GDDGGJIFNCH parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Unk3000_GDDGGJIFNCH.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Unk3000_GDDGGJIFNCH parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk3000_GDDGGJIFNCH.PARSER, input);
        }
        
        public static Unk3000_GDDGGJIFNCH parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk3000_GDDGGJIFNCH.PARSER, input, extensionRegistry);
        }
        
        public static Unk3000_GDDGGJIFNCH parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(Unk3000_GDDGGJIFNCH.PARSER, input);
        }
        
        public static Unk3000_GDDGGJIFNCH parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(Unk3000_GDDGGJIFNCH.PARSER, input, extensionRegistry);
        }
        
        public static Unk3000_GDDGGJIFNCH parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk3000_GDDGGJIFNCH.PARSER, input);
        }
        
        public static Unk3000_GDDGGJIFNCH parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk3000_GDDGGJIFNCH.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return Unk3000_GDDGGJIFNCH.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final Unk3000_GDDGGJIFNCH prototype) {
            return Unk3000_GDDGGJIFNCH.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == Unk3000_GDDGGJIFNCH.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static Unk3000_GDDGGJIFNCH getDefaultInstance() {
            return Unk3000_GDDGGJIFNCH.DEFAULT_INSTANCE;
        }
        
        public static Parser<Unk3000_GDDGGJIFNCH> parser() {
            return Unk3000_GDDGGJIFNCH.PARSER;
        }
        
        @Override
        public Parser<Unk3000_GDDGGJIFNCH> getParserForType() {
            return Unk3000_GDDGGJIFNCH.PARSER;
        }
        
        @Override
        public Unk3000_GDDGGJIFNCH getDefaultInstanceForType() {
            return Unk3000_GDDGGJIFNCH.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new Unk3000_GDDGGJIFNCH();
            PARSER = new AbstractParser<Unk3000_GDDGGJIFNCH>() {
                @Override
                public Unk3000_GDDGGJIFNCH parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new Unk3000_GDDGGJIFNCH(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements Unk3000_GDDGGJIFNCHOrBuilder
        {
            private int unk3000CFDMLGKNLKL_;
            private boolean unk3000HONINDEHLNO_;
            private boolean unk3000FIMENALCAKG_;
            private boolean unk3000BJGNKDEGLGC_;
            private int unk3000HPHLGFDHBON_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return Unk3000GDDGGJIFNCH.internal_static_Unk3000_GDDGGJIFNCH_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return Unk3000GDDGGJIFNCH.internal_static_Unk3000_GDDGGJIFNCH_fieldAccessorTable.ensureFieldAccessorsInitialized(Unk3000_GDDGGJIFNCH.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (Unk3000_GDDGGJIFNCH.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.unk3000CFDMLGKNLKL_ = 0;
                this.unk3000HONINDEHLNO_ = false;
                this.unk3000FIMENALCAKG_ = false;
                this.unk3000BJGNKDEGLGC_ = false;
                this.unk3000HPHLGFDHBON_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return Unk3000GDDGGJIFNCH.internal_static_Unk3000_GDDGGJIFNCH_descriptor;
            }
            
            @Override
            public Unk3000_GDDGGJIFNCH getDefaultInstanceForType() {
                return Unk3000_GDDGGJIFNCH.getDefaultInstance();
            }
            
            @Override
            public Unk3000_GDDGGJIFNCH build() {
                final Unk3000_GDDGGJIFNCH result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public Unk3000_GDDGGJIFNCH buildPartial() {
                final Unk3000_GDDGGJIFNCH result = new Unk3000_GDDGGJIFNCH(this);
                result.unk3000CFDMLGKNLKL_ = this.unk3000CFDMLGKNLKL_;
                result.unk3000HONINDEHLNO_ = this.unk3000HONINDEHLNO_;
                result.unk3000FIMENALCAKG_ = this.unk3000FIMENALCAKG_;
                result.unk3000BJGNKDEGLGC_ = this.unk3000BJGNKDEGLGC_;
                result.unk3000HPHLGFDHBON_ = this.unk3000HPHLGFDHBON_;
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
                if (other instanceof Unk3000_GDDGGJIFNCH) {
                    return this.mergeFrom((Unk3000_GDDGGJIFNCH)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final Unk3000_GDDGGJIFNCH other) {
                if (other == Unk3000_GDDGGJIFNCH.getDefaultInstance()) {
                    return this;
                }
                if (other.getUnk3000CFDMLGKNLKL() != 0) {
                    this.setUnk3000CFDMLGKNLKL(other.getUnk3000CFDMLGKNLKL());
                }
                if (other.getUnk3000HONINDEHLNO()) {
                    this.setUnk3000HONINDEHLNO(other.getUnk3000HONINDEHLNO());
                }
                if (other.getUnk3000FIMENALCAKG()) {
                    this.setUnk3000FIMENALCAKG(other.getUnk3000FIMENALCAKG());
                }
                if (other.getUnk3000BJGNKDEGLGC()) {
                    this.setUnk3000BJGNKDEGLGC(other.getUnk3000BJGNKDEGLGC());
                }
                if (other.getUnk3000HPHLGFDHBON() != 0) {
                    this.setUnk3000HPHLGFDHBON(other.getUnk3000HPHLGFDHBON());
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
                Unk3000_GDDGGJIFNCH parsedMessage = null;
                try {
                    parsedMessage = Unk3000_GDDGGJIFNCH.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (Unk3000_GDDGGJIFNCH)e.getUnfinishedMessage();
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
            public int getUnk3000CFDMLGKNLKL() {
                return this.unk3000CFDMLGKNLKL_;
            }
            
            public Builder setUnk3000CFDMLGKNLKL(final int value) {
                this.unk3000CFDMLGKNLKL_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk3000CFDMLGKNLKL() {
                this.unk3000CFDMLGKNLKL_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getUnk3000HONINDEHLNO() {
                return this.unk3000HONINDEHLNO_;
            }
            
            public Builder setUnk3000HONINDEHLNO(final boolean value) {
                this.unk3000HONINDEHLNO_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk3000HONINDEHLNO() {
                this.unk3000HONINDEHLNO_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getUnk3000FIMENALCAKG() {
                return this.unk3000FIMENALCAKG_;
            }
            
            public Builder setUnk3000FIMENALCAKG(final boolean value) {
                this.unk3000FIMENALCAKG_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk3000FIMENALCAKG() {
                this.unk3000FIMENALCAKG_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getUnk3000BJGNKDEGLGC() {
                return this.unk3000BJGNKDEGLGC_;
            }
            
            public Builder setUnk3000BJGNKDEGLGC(final boolean value) {
                this.unk3000BJGNKDEGLGC_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk3000BJGNKDEGLGC() {
                this.unk3000BJGNKDEGLGC_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getUnk3000HPHLGFDHBON() {
                return this.unk3000HPHLGFDHBON_;
            }
            
            public Builder setUnk3000HPHLGFDHBON(final int value) {
                this.unk3000HPHLGFDHBON_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk3000HPHLGFDHBON() {
                this.unk3000HPHLGFDHBON_ = 0;
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
    
    public interface Unk3000_GDDGGJIFNCHOrBuilder extends MessageOrBuilder
    {
        int getUnk3000CFDMLGKNLKL();
        
        boolean getUnk3000HONINDEHLNO();
        
        boolean getUnk3000FIMENALCAKG();
        
        boolean getUnk3000BJGNKDEGLGC();
        
        int getUnk3000HPHLGFDHBON();
    }
}
